package com.gossamercms.cms.dtos;

import com.gossamercms.cms.models.PageSectionDetail;
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
public class PageSectionDetailDto implements DtoWithId{
    private UUID id;
    private UUID sectionId;
    private Integer sortOrder;
    private String label;
    private String value;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public PageSectionDetail toEntity() {
        return PageSectionDetail.builder()
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
}
