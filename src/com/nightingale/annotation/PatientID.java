/*
 *
 * Copyright 2014 by Nightingale Informatix Corp.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author Vitaly Guriev
 */
package com.nightingale.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER,ElementType.TYPE,ElementType.METHOD, ElementType.FIELD})

/**
 * Annotation used to indicate that a parameter is an identifier for a patient.
 *
 */
public @interface PatientID {
    int scope() default PatientSecurityConstants.SCOPE_CHART;
    String description() default "";
    int getPatientID() default -1;
}
