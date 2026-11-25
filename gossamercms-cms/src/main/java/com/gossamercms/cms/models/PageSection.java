package com.gossamercms.cms.models;

import com.gossamercms.cms.dtos.PageSectionDto;
import com.gossamercms.mvc.models.BaseModel;
import com.gossamercms.mvc.models.ModelMeta;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;
import java.time.Instant;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageSection implements BaseModel{
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

    public PageSectionDto toDto() {
        return PageSectionDto.builder()
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


public static final ModelMeta META = ModelMeta.builderWithId("cms_page_sections")
    .column("id", UUID.class)
    .column("pageId", UUID.class)
    .column("type", String.class, 50)
    .column("theme", String.class, 50)
    .column("source", String.class, 100)
    .column("sortOrder", Integer.class)
    .column("kicker", String.class)
    .column("title", String.class)
    .column("body", String.class)
    .column("image", String.class, 1000)
    .column("imageAlt", String.class)
    .column("buttonLabel", String.class, 255)
    .column("buttonHref", String.class, 1000)
    .column("quote", String.class)
    .column("attribution", String.class, 255)
    .column("template", String.class)
    .column("columns", Integer.class)
    .column("deletedAt", Instant.class)
    .column("createdAt", Instant.class)
    .column("updatedAt", Instant.class)
    .defaultSort("id desc")
    .build();



    @Override
    public ModelMeta meta() {
        return META;
    }

    @Override
    public ModelMeta metaOf() {
        return BaseModel.super.metaOf();
    }

}
