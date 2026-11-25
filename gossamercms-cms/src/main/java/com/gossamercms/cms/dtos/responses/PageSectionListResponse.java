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
public class PageSectionListResponse {
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
    private Instant createdAt;

}