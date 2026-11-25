package com.gossamercms.cms.handlers;

import com.gossamercms.cms.data.PagesDbService;
import com.gossamercms.cms.dtos.PageDto;
import com.gossamercms.cms.models.Page;
import com.gossamercms.mvc.annotations.ModuleHandler;
import com.gossamercms.mvc.handlers.BaseHandler;

@ModuleHandler
public class PagesHandler extends BaseHandler<Page, PageDto> {

    public PagesHandler(PagesDbService db) {
        super(db);
    }
}
