package com.gossamercms.cms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminPageResponse {
    private UUID id;
    private String title;
    private String slug;
    private String description;
    private String status;
    private Instant createdAt;

}