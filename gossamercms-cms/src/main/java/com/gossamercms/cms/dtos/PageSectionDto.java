package com.gossamercms.cms.dtos;

import com.gossamercms.cms.models.PageSection;
import com.gossamercms.mvc.data.DtoWithId;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageSectionDto implements DtoWithId{
    private UUID id;
    private UUID pageId;
    private String type;
    private String theme;
    private String source;
    private Integer sortOrder;
    private String kicker;
    private String title;
    private String body;
    private String image;
    private String imageAlt;
    private String buttonLabel;
    private String buttonHref;
    private String quote;
    private String attribution;
    private String template;
    private Integer columns;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public PageSection toEntity() {
        return PageSection.builder()
            .id(id)
            .pageId(pageId)
            .type(type)
            .theme(theme)
            .source(source)
            .sortOrder(sortOrder)
            .kicker(kicker)
            .title(title)
            .body(body)
            .image(image)
            .imageAlt(imageAlt)
            .buttonLabel(buttonLabel)
            .buttonHref(buttonHref)
            .quote(quote)
            .attribution(attribution)
            .template(template)
            .columns(columns)
            .deletedAt(deletedAt)
            .createdAt(createdAt)
            .updatedAt(updatedAt)
            .build();
    }
}
