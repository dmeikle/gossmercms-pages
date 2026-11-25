package com.gossamercms.cms.dtos;

import com.gossamercms.cms.models.PageSectionItem;
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
public class PageSectionItemDto implements DtoWithId{
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

    public PageSectionItem toEntity() {
        return PageSectionItem.builder()
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
}
