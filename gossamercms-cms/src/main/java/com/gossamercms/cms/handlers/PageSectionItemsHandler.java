package com.gossamercms.cms.handlers;

import com.gossamercms.cms.data.PageSectionItemsDbService;
import com.gossamercms.cms.dtos.PageSectionItemDto;
import com.gossamercms.cms.models.PageSectionItem;
import com.gossamercms.mvc.annotations.ModuleHandler;
import com.gossamercms.mvc.handlers.BaseHandler;

@ModuleHandler
public class PageSectionItemsHandler extends BaseHandler<PageSectionItem, PageSectionItemDto> {

    public PageSectionItemsHandler(PageSectionItemsDbService db) {
        super(db);
    }
}
