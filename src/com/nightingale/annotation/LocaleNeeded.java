/*
* Copyright 2013 by Nightingale Informatix Corp.,
* All rights reserved.
*
* This software is the confidential and proprietary information
* of Nightingale Informatix Corp.
*
* @author Jonathan Goudreau
*/
package com.nightingale.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* An annotation for logging the audit when displaying info.
*/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LocaleNeeded {
}