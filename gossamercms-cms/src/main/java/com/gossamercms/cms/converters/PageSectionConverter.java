package com.gossamercms.cms.converters;

import com.gossamercms.cms.data.PageSectionsDbService;
import com.gossamercms.cms.dtos.PageSectionDto;
import com.gossamercms.mvc.annotations.ModuleConverter;
import org.springframework.core.convert.converter.Converter;
import com.gossamercms.mvc.converters.BaseConverter;

import java.util.UUID;


@ModuleConverter
public class PageSectionConverter
        extends BaseConverter<PageSectionDto>
         implements Converter<String, PageSectionDto> {

    public PageSectionConverter(PageSectionsDbService dbService) {
        super(dbService, PageSectionDto.class);
    }
}

