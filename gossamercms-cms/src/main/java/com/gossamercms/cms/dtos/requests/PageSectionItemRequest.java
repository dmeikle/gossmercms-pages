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
public class PageSectionItemRequest {
    private UUID sectionId;
    private Integer sortOrder;
    private String title;
    private String body;
    private String question;
    private String answer;

}
