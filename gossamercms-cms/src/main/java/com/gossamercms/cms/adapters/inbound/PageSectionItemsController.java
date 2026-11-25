package com.gossamercms.cms.adapters.inbound;


import com.gossamercms.cms.dtos.PageSectionItemDto;
import com.gossamercms.cms.dtos.requests.PageSectionItemRequest;
import com.gossamercms.cms.dtos.responses.PageSectionItemListResponse;
import com.gossamercms.cms.dtos.responses.PageSectionItemResponse;
import com.gossamercms.cms.handlers.PageSectionItemsHandler;
import com.gossamercms.cms.models.PageSectionItem;
import com.gossamercms.mvc.controllers.BaseController;
import com.gossamercms.mvc.controllers.TypedBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cms/page-section-items")
public class PageSectionItemsController extends TypedBaseController<PageSectionItem, PageSectionItemDto, PageSectionItemRequest,  PageSectionItemResponse, PageSectionItemListResponse> {

    public PageSectionItemsController(PageSectionItemsHandler handler) {
        super(handler, PageSectionItemListResponse.class);
    }
    @Override
        protected PageSectionItemDto toDto(PageSectionItemRequest request) {
            return PageSectionItemDto.builder()
                        .sectionId(request.getSectionId())
                        .sortOrder(request.getSortOrder())
                        .title(request.getTitle())
                        .body(request.getBody())
                        .question(request.getQuestion())
                        .answer(request.getAnswer())
                        .build();

        }

        @Override
        protected PageSectionItemResponse toResponse(PageSectionItemDto dto) {
            return PageSectionItemResponse.builder()
                           .id(dto.getId())
                           .sectionId(dto.getSectionId())
                           .sortOrder(dto.getSortOrder())
                           .title(dto.getTitle())
                           .body(dto.getBody())
                           .question(dto.getQuestion())
                           .answer(dto.getAnswer())
                           .createdAt(dto.getCreatedAt())
                           .build();

        }
}
