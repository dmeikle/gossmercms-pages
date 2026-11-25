package com.gossamercms.cms.handlers;

import com.gossamercms.cms.data.PageSectionDetailsDbService;
import com.gossamercms.cms.dtos.PageSectionDetailDto;
import com.gossamercms.cms.models.PageSectionDetail;
import com.gossamercms.mvc.annotations.ModuleHandler;
import com.gossamercms.mvc.handlers.BaseHandler;

@ModuleHandler
public class PageSectionDetailsHandler extends BaseHandler<PageSectionDetail, PageSectionDetailDto> {

    public PageSectionDetailsHandler(PageSectionDetailsDbService db) {
        super(db);
    }
}
