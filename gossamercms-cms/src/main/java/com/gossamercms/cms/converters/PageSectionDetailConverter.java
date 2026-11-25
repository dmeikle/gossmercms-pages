package com.gossamercms.cms.converters;

import com.gossamercms.cms.data.PageSectionDetailsDbService;
import com.gossamercms.cms.dtos.PageSectionDetailDto;
import com.gossamercms.mvc.annotations.ModuleConverter;
import org.springframework.core.convert.converter.Converter;
import com.gossamercms.mvc.converters.BaseConverter;

import java.util.UUID;


@ModuleConverter
public class PageSectionDetailConverter
        extends BaseConverter<PageSectionDetailDto>
         implements Converter<String, PageSectionDetailDto> {

    public PageSectionDetailConverter(PageSectionDetailsDbService dbService) {
        super(dbService, PageSectionDetailDto.class);
    }
}

