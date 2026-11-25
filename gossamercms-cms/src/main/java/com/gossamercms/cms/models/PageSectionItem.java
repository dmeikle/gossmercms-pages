package com.gossamercms.cms.models;

import com.gossamercms.cms.dtos.PageSectionItemDto;
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
public class PageSectionItem implements BaseModel{
    private UUID id;
    private UUID sectionId;
    private Integer sortOrder;
    private String title;
    private String body;
    private String question;
    private String answer;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public PageSectionItemDto toDto() {
        return PageSectionItemDto.builder()
            .id(id)
            .sectionId(sectionId)
            .sortOrder(sortOrder)
            .title(title)
            .body(body)
            .question(question)
            .answer(answer)
            .deletedAt(deletedAt)
            .createdAt(createdAt)
            .updatedAt(updatedAt)
            .build();
    }


public static final ModelMeta META = ModelMeta.builderWithId("cms_page_section_items")
    .column("id", UUID.class)
    .column("sectionId", UUID.class)
    .column("sortOrder", Integer.class)
    .column("title", String.class)
    .column("body", String.class)
    .column("question", String.class)
    .column("answer", String.class)
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
