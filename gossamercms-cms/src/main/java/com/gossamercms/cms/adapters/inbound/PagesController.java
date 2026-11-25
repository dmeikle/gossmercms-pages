package com.gossamercms.cms.adapters.inbound;


import com.gossamercms.cms.dtos.PageDto;
import com.gossamercms.cms.dtos.requests.PageRequest;
import com.gossamercms.cms.dtos.responses.PageListResponse;
import com.gossamercms.cms.dtos.responses.PageResponse;
import com.gossamercms.cms.handlers.PagesHandler;
import com.gossamercms.cms.models.Page;
import com.gossamercms.cms.services.PagesService;
import com.gossamercms.mvc.annotations.CurrentUser;
import com.gossamercms.mvc.controllers.TypedBaseController;
import com.gossamercms.mvc.http.ApiResponse;
import com.gossamercms.mvc.jwt.CurrentJwtUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cms/pages")
public class PagesController extends TypedBaseController<Page, PageDto, PageRequest, PageResponse, PageListResponse> {

    private final PagesService pagesService;

    public PagesController(PagesHandler handler,
                           PagesService pagesService) {
        super(handler, PageListResponse.class);
        this.pagesService = pagesService;
    }

    @Override
        protected PageDto toDto(PageRequest request) {
            return PageDto.builder()
                        .title(request.getTitle())
                        .slug(request.getSlug())
                        .description(request.getDescription())
                        .status(request.getStatus())
                        .build();

        }

        @Override
        protected PageResponse toResponse(PageDto dto) {
            return PageResponse.builder()
                           .id(dto.getId())
                           .title(dto.getTitle())
                           .slug(dto.getSlug())
                           .description(dto.getDescription())
                           .status(dto.getStatus())
                           .createdAt(dto.getCreatedAt())
                           .build();

        }

        @GetMapping("/{page}")
        public ApiResponse<PageResponse> getPageDetails(
            @CurrentUser CurrentJwtUser jwtUser,
            @PathVariable("page") PageDto existing
        ) {
            return ApiResponse.ok(pagesService.getPageDetails(existing));
        }
}
