package com.gossamercms.cms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageSectionItemListResponse {
    private UUID id;
    private UUID sectionId;
    private Integer sortOrder;
    private String title;
    private String body;
    private String question;
    private String answer;
    private Instant createdAt;

}