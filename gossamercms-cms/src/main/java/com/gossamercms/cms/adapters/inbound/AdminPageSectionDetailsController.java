package com.gossamercms.cms.adapters.inbound;


import com.gossamercms.cms.dtos.PageSectionDetailDto;
import com.gossamercms.cms.dtos.requests.PageSectionDetailRequest;
import com.gossamercms.cms.dtos.responses.PageSectionDetailListResponse;
import com.gossamercms.cms.dtos.responses.PageSectionDetailResponse;
import com.gossamercms.cms.handlers.PageSectionDetailsHandler;
import com.gossamercms.cms.models.PageSectionDetail;
import com.gossamercms.mvc.controllers.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin/cms/page-section-details")
public class AdminPageSectionDetailsController extends BaseController<PageSectionDetail, PageSectionDetailDto, PageSectionDetailRequest,  PageSectionDetailResponse, PageSectionDetailListResponse> {

    public AdminPageSectionDetailsController(PageSectionDetailsHandler handler) {
        super(handler, PageSectionDetailListResponse.class, true);
    }
    @Override
        protected PageSectionDetailDto toDto(PageSectionDetailRequest request) {
            return PageSectionDetailDto.builder()
                        .sectionId(request.getSectionId())
                        .sortOrder(request.getSortOrder())
                        .label(request.getLabel())
                        .value(request.getValue())
                        .build();

        }

        @Override
        protected PageSectionDetailResponse toResponse(PageSectionDetailDto dto) {
            return PageSectionDetailResponse.builder()
                           .id(dto.getId())
                           .sectionId(dto.getSectionId())
                           .sortOrder(dto.getSortOrder())
                           .label(dto.getLabel())
                           .value(dto.getValue())
                           .createdAt(dto.getCreatedAt())
                           .build();

        }
}
