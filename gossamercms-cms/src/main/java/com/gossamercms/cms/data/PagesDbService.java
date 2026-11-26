package com.gossamercms.cms.data;

import com.gossamercms.cms.dtos.PageDto;
import com.gossamercms.cms.dtos.responses.PageListResponse;
import com.gossamercms.cms.dtos.responses.PageResponse;
import com.gossamercms.cms.models.Page;
import com.gossamercms.mvc.annotations.ModuleDbService;
import com.gossamercms.mvc.data.BaseDbService;
import com.gossamercms.mvc.data.DataSourceAdapter;
import com.gossamercms.mvc.data.DataSourceManager;
import tools.jackson.databind.ObjectMapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@ModuleDbService
public class PagesDbService extends BaseDbService<Page, PageDto> {

    private final ObjectMapper objectMapper;

    public PagesDbService(DataSourceManager ds, ObjectMapper objectMapper) {
        super(Page.class, PageDto.class, ds);
        this.objectMapper = objectMapper;
    }

    @Override
    protected Page mapToEntity(PageDto dto) {
        return dto.toEntity();
    }

    @Override
    protected PageDto mapToDto(Page entity) {
        return entity.toDto();
    }

    @Override
    protected PageDto removeExcludedFields(PageDto dto) {
        return dto;
    }

    public PageResponse getPageDetails(PageDto page) {
        String sql = """
                SELECT jsonb_build_object(
                    'id', p.id,
                    'title', p.title,
                    'slug', p.slug,
                    'description', p.description,
                    'seoTitle', p."seoTitle",
                    'seoDescription', p."seoDescription",
                    'seoImage', p."seoImage",
                    'status', p.status,
                    'createdAt', p."createdAt" AT TIME ZONE 'UTC',
                    'sections', COALESCE((
                        SELECT jsonb_agg(
                            jsonb_build_object(
                                'id', s.id,
                                'pageId', s."pageId",
                                'type', s.type,
                                'theme', s.theme,
                                'source', s.source,
                                'sortOrder', s."sortOrder",
                                'kicker', s.kicker,
                                'title', s.title,
                                'body', s.body,
                                'image', s.image,
                                'imageAlt', s."imageAlt",
                                'buttonLabel', s."buttonLabel",
                                'buttonHref', s."buttonHref",
                                'quote', s.quote,
                                'attribution', s.attribution,
                                'template', s.template,
                                'columns', s.columns,
                                'createdAt', s."createdAt" AT TIME ZONE 'UTC',
                                'items', COALESCE((
                                    SELECT jsonb_agg(
                                        jsonb_build_object(
                                            'id', i.id,
                                            'sectionId', i."sectionId",
                                            'sortOrder', i."sortOrder",
                                            'title', i.title,
                                            'body', i.body,
                                            'question', i.question,
                                            'answer', i.answer,
                                            'createdAt', i."createdAt" AT TIME ZONE 'UTC'
                                        )
                                        ORDER BY i."sortOrder"
                                    )
                                    FROM cms_page_section_items i
                                    WHERE i."sectionId" = s.id
                                      AND i."deletedAt" IS NULL
                                ), '[]'::jsonb),
                                'includes', COALESCE((
                                    SELECT jsonb_agg(
                                        jsonb_build_object(
                                            'id', inc.id,
                                            'sectionId', inc."sectionId",
                                            'sortOrder', inc."sortOrder",
                                            'text', inc.text,
                                            'createdAt', inc."createdAt" AT TIME ZONE 'UTC'
                                        )
                                        ORDER BY inc."sortOrder"
                                    )
                                    FROM cms_page_section_includes inc
                                    WHERE inc."sectionId" = s.id
                                      AND inc."deletedAt" IS NULL
                                ), '[]'::jsonb),
                                'details', COALESCE((
                                    SELECT jsonb_agg(
                                        jsonb_build_object(
                                            'id', d.id,
                                            'sectionId', d."sectionId",
                                            'sortOrder', d."sortOrder",
                                            'label', d.label,
                                            'value', d.value,
                                            'createdAt', d."createdAt" AT TIME ZONE 'UTC'
                                        )
                                        ORDER BY d."sortOrder"
                                    )
                                    FROM cms_page_section_details d
                                    WHERE d."sectionId" = s.id
                                      AND d."deletedAt" IS NULL
                                ), '[]'::jsonb)
                            )
                            ORDER BY s."sortOrder"
                        )
                        FROM cms_page_sections s
                        WHERE s."pageId" = p.id
                          AND s."deletedAt" IS NULL
                    ), '[]'::jsonb)
                ) AS page
                FROM cms_pages p
                WHERE p.id = :pageId
                  AND p.status = 'published'
                  AND p."deletedAt" IS NULL;
                """;
        DataSourceAdapter ds = dsManager.get(meta.datasourceKey());

        return ds.findOneBySql(
                sql,
                Map.of("pageId", page.getId()),
                (rs, rowNum) -> {
                    String json = rs.getString("page");
                    if (json == null) {
                        return null;
                    }
                    return objectMapper.readValue(json, PageResponse.class);
                }
        );
    }

    public List<PageListResponse> listPublishedPages() {
        String sql = """
                SELECT p.id,
                       p.title,
                       p.slug,
                       p.status,
                       p."createdAt"
                FROM cms_pages p
                WHERE p.status = 'published'
                  AND p."deletedAt" IS NULL
                ORDER BY p."createdAt" ASC NULLS LAST, p.title ASC
                """;
        return dsManager.get(meta.datasourceKey())
                .getNamedParameterJdbcTemplate()
                .query(sql, Map.of(), (rs, rowNum) -> {
                    Timestamp createdAt = rs.getTimestamp("createdAt");
                    return PageListResponse.builder()
                            .id(rs.getObject("id", UUID.class))
                            .title(rs.getString("title"))
                            .slug(rs.getString("slug"))
                            .status(rs.getString("status"))
                            .createdAt(createdAt == null ? null : createdAt.toInstant())
                            .build();
                });
    }

}
