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
public class PageSectionDetailRequest {
    private UUID sectionId;
    private Integer sortOrder;
    private String label;
    private String value;

}
