package com.gossamercms.cms.services;

import com.gossamercms.cms.data.PageSectionDetailsDbService;
import com.gossamercms.cms.data.PageSectionIncludesDbService;
import com.gossamercms.cms.data.PageSectionsDbService;
import com.gossamercms.cms.data.PagesDbService;
import com.gossamercms.cms.dtos.PageDto;
import com.gossamercms.cms.dtos.responses.PageListResponse;
import com.gossamercms.cms.dtos.responses.PageResponse;
import com.gossamercms.mvc.annotations.ModuleService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ModuleService
@RequiredArgsConstructor
public class PagesService {
    private final PagesDbService pagesDbService;
    private final PageSectionsDbService pageSectionsDbService;
    private final PageSectionDetailsDbService pageSectionDetailsDbService;
    private final PageSectionIncludesDbService pageSectionIncludesDbService;
    private final PageSectionsDbService pageSectionItemsDbService;

    public PageResponse getPageDetails(PageDto page) {
        return pagesDbService.getPageDetails(page);
    }

    public List<PageListResponse> listPublishedPages() {
        return pagesDbService.listPublishedPages();
    }
}
