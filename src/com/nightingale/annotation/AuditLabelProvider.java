package com.nightingale.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})

/**
 * Annotation used to mark a field in a bean with mapping label provider
 *
 */

public @interface AuditLabelProvider {
    String value();
    boolean isUserDefinedField() default false;
    String predicate() default "";
}
