package com.gossamercms.cms.converters;

import com.gossamercms.cms.data.PageSectionItemsDbService;
import com.gossamercms.cms.dtos.PageSectionItemDto;
import com.gossamercms.mvc.annotations.ModuleConverter;
import org.springframework.core.convert.converter.Converter;
import com.gossamercms.mvc.converters.BaseConverter;

import java.util.UUID;


@ModuleConverter
public class PageSectionItemConverter
        extends BaseConverter<PageSectionItemDto>
         implements Converter<String, PageSectionItemDto> {

    public PageSectionItemConverter(PageSectionItemsDbService dbService) {
        super(dbService, PageSectionItemDto.class);
    }
}

