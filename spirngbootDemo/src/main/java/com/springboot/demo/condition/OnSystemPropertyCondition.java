package com.springboot.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.lang.annotation.Annotation;
import java.util.Map;

public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        String name = (String)annotationAttributes.get("name");
        //System.out.println(name);
        String value = (String)annotationAttributes.get("value");
        //System.out.println(value);
        String realValue = System.getProperty(name);
        //System.out.println(realValue);
        return value.equals(realValue);
    }
}
