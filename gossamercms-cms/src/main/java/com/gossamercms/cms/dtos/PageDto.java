package com.gossamercms.cms.dtos;

import com.gossamercms.cms.models.Page;
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
public class PageDto implements DtoWithId{
    private UUID id;
    private String title;
    private String slug;
    private String description;
    private String status;
    private UUID createdBy;
    private Instant deletedAt;
    private Instant createdAt;
    private Instant updatedAt;

    public Page toEntity() {
        return Page.builder()
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
}
