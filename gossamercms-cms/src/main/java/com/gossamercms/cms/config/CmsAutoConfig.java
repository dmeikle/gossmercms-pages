package com.gossamercms.cms.config;

import com.gossamercms.mvc.autoconfig.*;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.AutoConfiguration;

@AutoConfiguration
@EnableModuleModels(basePackage = "com.gossamercms.cms.models")
@EnableModuleConverters(basePackage = "com.gossamercms.cms.converters")
@EnableModuleDbServices(basePackage = "com.gossamercms.cms.data")
@EnableModuleHandlers(basePackage = "com.gossamercms.cms.handlers")
@EnableModuleServices(basePackage = "com.gossamercms.cms.services")
@EnableModuleProviders(basePackage = "com.gossamercms.cms.providers")
@EnableModuleEventListeners(basePackage = "com.gossamercms.cms.listeners")
public class CmsAutoConfig {

    @PostConstruct
    public void init() {
        System.out.println("************************************************************");
        System.out.println(">>> CmsAutoConfig LOADED");
        System.out.println("************************************************************");
    }

}
