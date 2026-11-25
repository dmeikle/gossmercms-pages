package com.gossamercms.cms.handlers;

import com.gossamercms.cms.data.PageSectionsDbService;
import com.gossamercms.cms.dtos.PageSectionDto;
import com.gossamercms.cms.models.PageSection;
import com.gossamercms.mvc.annotations.ModuleHandler;
import com.gossamercms.mvc.handlers.BaseHandler;

@ModuleHandler
public class PageSectionsHandler extends BaseHandler<PageSection, PageSectionDto> {

    public PageSectionsHandler(PageSectionsDbService db) {
        super(db);
    }
}
