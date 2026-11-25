package com.gossamercms.cms.data;

import com.gossamercms.cms.dtos.PageSectionDetailDto;
import com.gossamercms.cms.models.PageSectionDetail;
import com.gossamercms.mvc.annotations.ModuleDbService;
import com.gossamercms.mvc.data.BaseDbService;
import com.gossamercms.mvc.data.DataSourceManager;
import com.gossamercms.mvc.data.ListResultset;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@ModuleDbService
public class PageSectionDetailsDbService extends BaseDbService<PageSectionDetail, PageSectionDetailDto> {

    public PageSectionDetailsDbService(DataSourceManager ds) {
        super(PageSectionDetail.class, PageSectionDetailDto.class, ds);
    }

    @Override
    protected PageSectionDetail mapToEntity(PageSectionDetailDto dto) {
        return dto.toEntity();
    }

    @Override
    protected PageSectionDetailDto mapToDto(PageSectionDetail entity) {
        return entity.toDto();
    }

    @Override
    protected PageSectionDetailDto removeExcludedFields(PageSectionDetailDto dto) {
        return dto;
    }

    @Override
    protected void throw404(String id) {

    }

}
