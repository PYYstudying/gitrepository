package com.springboot.demo.annotation;

import com.springboot.demo.configuration.DemoConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class DemoImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{DemoConfiguration.class.getName()};
    }
}
