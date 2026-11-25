package com.gossamercms.cms.adapters.inbound;


import com.gossamercms.cms.dtos.PageSectionIncludeDto;
import com.gossamercms.cms.dtos.requests.PageSectionIncludeRequest;
import com.gossamercms.cms.dtos.responses.PageSectionIncludeListResponse;
import com.gossamercms.cms.dtos.responses.PageSectionIncludeResponse;
import com.gossamercms.cms.handlers.PageSectionIncludesHandler;
import com.gossamercms.cms.models.PageSectionInclude;
import com.gossamercms.mvc.controllers.BaseController;
import com.gossamercms.mvc.controllers.TypedBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cms/page-section-includes")
public class PageSectionIncludesController extends TypedBaseController<PageSectionInclude, PageSectionIncludeDto, PageSectionIncludeRequest,  PageSectionIncludeResponse, PageSectionIncludeListResponse> {

    public PageSectionIncludesController(PageSectionIncludesHandler handler) {
        super(handler, PageSectionIncludeListResponse.class);
    }
    @Override
        protected PageSectionIncludeDto toDto(PageSectionIncludeRequest request) {
            return PageSectionIncludeDto.builder()
                        .sectionId(request.getSectionId())
                        .sortOrder(request.getSortOrder())
                        .text(request.getText())
                        .build();

        }

        @Override
        protected PageSectionIncludeResponse toResponse(PageSectionIncludeDto dto) {
            return PageSectionIncludeResponse.builder()
                           .id(dto.getId())
                           .sectionId(dto.getSectionId())
                           .sortOrder(dto.getSortOrder())
                           .text(dto.getText())
                           .createdAt(dto.getCreatedAt())
                           .build();

        }
}
