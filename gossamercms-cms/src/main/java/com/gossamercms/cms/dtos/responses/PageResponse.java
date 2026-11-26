package com.gossamercms.cms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse {
    private UUID id;
    private String title;
    private String slug;
    private String description;
    private String seoTitle;
    private String seoDescription;
    private String seoImage;
    private String status;
    private Instant createdAt;
    @Builder.Default
    private List<PageSectionResponse> sections = new ArrayList<>();
}