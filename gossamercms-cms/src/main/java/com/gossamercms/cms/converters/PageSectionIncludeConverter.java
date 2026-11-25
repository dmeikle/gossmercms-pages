package com.gossamercms.cms.converters;

import com.gossamercms.cms.data.PageSectionIncludesDbService;
import com.gossamercms.cms.dtos.PageSectionIncludeDto;
import com.gossamercms.mvc.annotations.ModuleConverter;
import org.springframework.core.convert.converter.Converter;
import com.gossamercms.mvc.converters.BaseConverter;

import java.util.UUID;


@ModuleConverter
public class PageSectionIncludeConverter
        extends BaseConverter<PageSectionIncludeDto>
         implements Converter<String, PageSectionIncludeDto> {

    public PageSectionIncludeConverter(PageSectionIncludesDbService dbService) {
        super(dbService, PageSectionIncludeDto.class);
    }
}

