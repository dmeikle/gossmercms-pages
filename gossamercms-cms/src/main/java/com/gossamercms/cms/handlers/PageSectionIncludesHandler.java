package com.gossamercms.cms.handlers;

import com.gossamercms.cms.data.PageSectionIncludesDbService;
import com.gossamercms.cms.dtos.PageSectionIncludeDto;
import com.gossamercms.cms.models.PageSectionInclude;
import com.gossamercms.mvc.annotations.ModuleHandler;
import com.gossamercms.mvc.handlers.BaseHandler;

@ModuleHandler
public class PageSectionIncludesHandler extends BaseHandler<PageSectionInclude, PageSectionIncludeDto> {

    public PageSectionIncludesHandler(PageSectionIncludesDbService db) {
        super(db);
    }
}
