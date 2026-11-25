package com.gossamercms.cms.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageSectionRequest {
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

}
