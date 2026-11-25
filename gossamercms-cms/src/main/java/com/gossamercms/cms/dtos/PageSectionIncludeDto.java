package com.gossamercms.cms.dtos;

import com.gossamercms.cms.models.PageSectionInclude;
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
public class PageSectionIncludeDto implements DtoWithId{
    private UUID id;
    private UUID sectionId;
    private Integer sortOrder;
    private String text;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public PageSectionInclude toEntity() {
        return PageSectionInclude.builder()
            .id(id)
            .sectionId(sectionId)
            .sortOrder(sortOrder)
            .text(text)
            .deletedAt(deletedAt)
            .createdAt(createdAt)
            .updatedAt(updatedAt)
            .build();
    }
}
