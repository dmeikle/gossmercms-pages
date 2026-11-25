package com.gossamercms.cms.data;

import com.gossamercms.cms.dtos.PageSectionDto;
import com.gossamercms.cms.models.PageSection;
import com.gossamercms.mvc.annotations.ModuleDbService;
import com.gossamercms.mvc.data.BaseDbService;
import com.gossamercms.mvc.data.DataSourceManager;
import com.gossamercms.mvc.data.ListResultset;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@ModuleDbService
public class PageSectionsDbService extends BaseDbService<PageSection, PageSectionDto> {

    public PageSectionsDbService(DataSourceManager ds) {
        super(PageSection.class, PageSectionDto.class, ds);
    }

    @Override
    protected PageSection mapToEntity(PageSectionDto dto) {
        return dto.toEntity();
    }

    @Override
    protected PageSectionDto mapToDto(PageSection entity) {
        return entity.toDto();
    }

    @Override
    protected PageSectionDto removeExcludedFields(PageSectionDto dto) {
        return dto;
    }

    @Override
    protected void throw404(String id) {

    }

}
