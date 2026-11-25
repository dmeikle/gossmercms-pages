package com.gossamercms.cms.adapters.inbound;


import com.gossamercms.cms.dtos.PageSectionDto;
import com.gossamercms.cms.dtos.requests.PageSectionRequest;
import com.gossamercms.cms.dtos.responses.PageSectionListResponse;
import com.gossamercms.cms.dtos.responses.AdminPageSectionResponse;
import com.gossamercms.cms.handlers.PageSectionsHandler;
import com.gossamercms.cms.models.PageSection;
import com.gossamercms.mvc.controllers.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin/cms/page-sections")
public class AdminPageSectionsController extends BaseController<PageSection, PageSectionDto, PageSectionRequest, AdminPageSectionResponse, PageSectionListResponse> {

    public AdminPageSectionsController(PageSectionsHandler handler) {
        super(handler, PageSectionListResponse.class);
    }
    @Override
        protected PageSectionDto toDto(PageSectionRequest request) {
            return PageSectionDto.builder()
                        .pageId(request.getPageId())
                        .type(request.getType())
                        .theme(request.getTheme())
                        .source(request.getSource())
                        .sortOrder(request.getSortOrder())
                        .kicker(request.getKicker())
                        .title(request.getTitle())
                        .body(request.getBody())
                        .image(request.getImage())
                        .imageAlt(request.getImageAlt())
                        .buttonLabel(request.getButtonLabel())
                        .buttonHref(request.getButtonHref())
                        .quote(request.getQuote())
                        .attribution(request.getAttribution())
                        .template(request.getTemplate())
                        .columns(request.getColumns())
                        .build();

        }

        @Override
        protected AdminPageSectionResponse toResponse(PageSectionDto dto) {
            return AdminPageSectionResponse.builder()
                           .id(dto.getId())
                           .pageId(dto.getPageId())
                           .type(dto.getType())
                           .theme(dto.getTheme())
                           .source(dto.getSource())
                           .sortOrder(dto.getSortOrder())
                           .kicker(dto.getKicker())
                           .title(dto.getTitle())
                           .body(dto.getBody())
                           .image(dto.getImage())
                           .imageAlt(dto.getImageAlt())
                           .buttonLabel(dto.getButtonLabel())
                           .buttonHref(dto.getButtonHref())
                           .quote(dto.getQuote())
                           .attribution(dto.getAttribution())
                           .template(dto.getTemplate())
                           .columns(dto.getColumns())
                           .createdAt(dto.getCreatedAt())
                           .build();

        }
}
