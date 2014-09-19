/*
 *
 * Copyright 2012 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author David Labbe
 */
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
@Target({ElementType.PARAMETER,ElementType.TYPE,ElementType.METHOD})

/**
 * Annotation used to indicate that a parameter contains credential information
 * Used by Security to enforce security based on User login on RPC interfaces
 */
public @interface Secure {
    boolean adminBypass() default false;
}
