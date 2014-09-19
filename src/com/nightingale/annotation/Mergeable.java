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
@Target({ElementType.FIELD, ElementType.TYPE})

/**
 * If used on a class level, means that the bean marked with the annotation will
 * participate in Patient Chart Merge procedure (@see MergeChart.java)
 *
 * If used on a field level, marks up field in a bean as a candidate to comparison and merge
 * with another field of the bean of the same class
 *
 */

public @interface Mergeable {
}