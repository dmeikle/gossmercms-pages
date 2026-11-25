package com.gossamercms.cms.models;

import com.gossamercms.cms.dtos.PageDto;
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
public class Page implements BaseModel{
    private UUID id;
    private String title;
    private String slug;
    private String description;
    private String status;
    private UUID createdBy;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public PageDto toDto() {
        return PageDto.builder()
            .id(id)
            .title(title)
            .slug(slug)
            .description(description)
            .status(status)
            .createdBy(createdBy)
            .deletedAt(deletedAt)
            .createdAt(createdAt)
            .updatedAt(updatedAt)
            .build();
    }


public static final ModelMeta META = ModelMeta.builderWithId("cms_pages")
    .column("id", UUID.class)
    .column("title", String.class, 255)
    .column("slug", String.class, 255)
    .column("description", String.class)
    .column("status", String.class, 50)
    .column("createdBy", UUID.class)
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
