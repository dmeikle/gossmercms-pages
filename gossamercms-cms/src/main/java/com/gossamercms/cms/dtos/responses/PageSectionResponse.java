package com.gossamercms.cms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageSectionResponse {
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

    @Builder.Default
    private List<PageSectionItemResponse> items = new ArrayList<>();
    @Builder.Default
    private List<PageSectionIncludeResponse> includes = new ArrayList<>();
    @Builder.Default
    private List<PageSectionDetailResponse> details = new ArrayList<>();
}
