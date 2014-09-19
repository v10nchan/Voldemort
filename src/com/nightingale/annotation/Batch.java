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

/*
 * Used to indicate if the interface will be automatically batched.
 * This is used by the Action generator
 */
public @interface Batch {
    boolean isBatch() default true;
}
