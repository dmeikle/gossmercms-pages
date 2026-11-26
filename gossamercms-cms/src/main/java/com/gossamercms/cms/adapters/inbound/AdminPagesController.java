package com.gossamercms.cms.adapters.inbound;


import com.gossamercms.cms.dtos.PageDto;
import com.gossamercms.cms.dtos.requests.PageRequest;
import com.gossamercms.cms.dtos.responses.PageListResponse;
import com.gossamercms.cms.dtos.responses.AdminPageResponse;
import com.gossamercms.cms.handlers.PagesHandler;
import com.gossamercms.cms.models.Page;
import com.gossamercms.mvc.controllers.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin/cms/pages")
public class AdminPagesController extends BaseController<Page, PageDto, PageRequest, AdminPageResponse, PageListResponse> {

    public AdminPagesController(PagesHandler handler) {
        super(handler, PageListResponse.class, true);
    }
    @Override
        protected PageDto toDto(PageRequest request) {
            return PageDto.builder()
                        .title(request.getTitle())
                        .slug(request.getSlug())
                        .description(request.getDescription())
                        .seoTitle(request.getSeoTitle())
                        .seoDescription(request.getSeoDescription())
                        .seoImage(request.getSeoImage())
                        .status(request.getStatus())
                        .build();

        }

        @Override
        protected AdminPageResponse toResponse(PageDto dto) {
            return AdminPageResponse.builder()
                           .id(dto.getId())
                           .title(dto.getTitle())
                           .slug(dto.getSlug())
                           .description(dto.getDescription())
                           .seoTitle(dto.getSeoTitle())
                           .seoDescription(dto.getSeoDescription())
                           .seoImage(dto.getSeoImage())
                           .status(dto.getStatus())
                           .createdAt(dto.getCreatedAt())
                           .build();

        }
}
