package com.gossamercms.cms.data;

import com.gossamercms.cms.dtos.PageSectionIncludeDto;
import com.gossamercms.cms.models.PageSectionInclude;
import com.gossamercms.mvc.annotations.ModuleDbService;
import com.gossamercms.mvc.data.BaseDbService;
import com.gossamercms.mvc.data.DataSourceManager;
import com.gossamercms.mvc.data.ListResultset;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@ModuleDbService
public class PageSectionIncludesDbService extends BaseDbService<PageSectionInclude, PageSectionIncludeDto> {

    public PageSectionIncludesDbService(DataSourceManager ds) {
        super(PageSectionInclude.class, PageSectionIncludeDto.class, ds);
    }

    @Override
    protected PageSectionInclude mapToEntity(PageSectionIncludeDto dto) {
        return dto.toEntity();
    }

    @Override
    protected PageSectionIncludeDto mapToDto(PageSectionInclude entity) {
        return entity.toDto();
    }

    @Override
    protected PageSectionIncludeDto removeExcludedFields(PageSectionIncludeDto dto) {
        return dto;
    }

    @Override
    protected void throw404(String id) {

    }

}
