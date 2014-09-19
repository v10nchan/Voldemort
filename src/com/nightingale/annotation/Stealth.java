/*
 *
 * Copyright 2009 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Medrium, Inc.
 *
 * @author Prasad Mokkapati
*/
package com.nightingale.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

/**
 * An annotation that makes it so that the rpc call is put in stealth mode automatically.
 */
public @interface Stealth {
}
