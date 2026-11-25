package com.gossamercms.cms.models;

import com.gossamercms.cms.dtos.PageSectionIncludeDto;
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
public class PageSectionInclude implements BaseModel{
    private UUID id;
    private UUID sectionId;
    private Integer sortOrder;
    private String text;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public PageSectionIncludeDto toDto() {
        return PageSectionIncludeDto.builder()
            .id(id)
            .sectionId(sectionId)
            .sortOrder(sortOrder)
            .text(text)
            .deletedAt(deletedAt)
            .createdAt(createdAt)
            .updatedAt(updatedAt)
            .build();
    }


public static final ModelMeta META = ModelMeta.builderWithId("cms_page_section_includes")
    .column("id", UUID.class)
    .column("sectionId", UUID.class)
    .column("sortOrder", Integer.class)
    .column("text", String.class)
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
