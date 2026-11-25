package com.gossamercms.cms.converters;

import com.gossamercms.cms.data.PagesDbService;
import com.gossamercms.cms.dtos.PageDto;
import com.gossamercms.mvc.annotations.ModuleConverter;
import org.springframework.core.convert.converter.Converter;
import com.gossamercms.mvc.converters.BaseConverter;

import java.util.UUID;


@ModuleConverter
public class PageConverter
        extends BaseConverter<PageDto>
         implements Converter<String, PageDto> {

    public PageConverter(PagesDbService dbService) {
        super(dbService, PageDto.class);
    }
}

