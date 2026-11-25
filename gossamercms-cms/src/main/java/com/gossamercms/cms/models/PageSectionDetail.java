package com.gossamercms.cms.models;

import com.gossamercms.cms.dtos.PageSectionDetailDto;
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
public class PageSectionDetail implements BaseModel{
    private UUID id;
    private UUID sectionId;
    private Integer sortOrder;
    private String label;
    private String value;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public PageSectionDetailDto toDto() {
        return PageSectionDetailDto.builder()
            .id(id)
            .sectionId(sectionId)
            .sortOrder(sortOrder)
            .label(label)
            .value(value)
            .deletedAt(deletedAt)
            .createdAt(createdAt)
            .updatedAt(updatedAt)
            .build();
    }


public static final ModelMeta META = ModelMeta.builderWithId("cms_page_section_details")
    .column("id", UUID.class)
    .column("sectionId", UUID.class)
    .column("sortOrder", Integer.class)
    .column("label", String.class, 255)
    .column("value", String.class)
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
