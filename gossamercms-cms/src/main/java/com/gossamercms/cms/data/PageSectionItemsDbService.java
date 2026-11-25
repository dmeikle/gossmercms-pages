package com.gossamercms.cms.data;

import com.gossamercms.cms.dtos.PageSectionItemDto;
import com.gossamercms.cms.models.PageSectionItem;
import com.gossamercms.mvc.annotations.ModuleDbService;
import com.gossamercms.mvc.data.BaseDbService;
import com.gossamercms.mvc.data.DataSourceManager;
import com.gossamercms.mvc.data.ListResultset;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@ModuleDbService
public class PageSectionItemsDbService extends BaseDbService<PageSectionItem, PageSectionItemDto> {

    public PageSectionItemsDbService(DataSourceManager ds) {
        super(PageSectionItem.class, PageSectionItemDto.class, ds);
    }

    @Override
    protected PageSectionItem mapToEntity(PageSectionItemDto dto) {
        return dto.toEntity();
    }

    @Override
    protected PageSectionItemDto mapToDto(PageSectionItem entity) {
        return entity.toDto();
    }

    @Override
    protected PageSectionItemDto removeExcludedFields(PageSectionItemDto dto) {
        return dto;
    }

    @Override
    protected void throw404(String id) {

    }

}
