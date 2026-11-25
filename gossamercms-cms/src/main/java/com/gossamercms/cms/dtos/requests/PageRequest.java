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
public class PageRequest {
    private String title;
    private String slug;
    private String description;
    private String status;

}
