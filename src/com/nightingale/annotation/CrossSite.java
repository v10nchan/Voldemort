/*
 *
 * Copyright 2010 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Medrium, Inc.
 *
 * @author Remy Beaumont
*/
package com.nightingale.annotation;

/*
 * Used to indicate if the interface will be used for CrossSite communication.
 * This is used by the Action generator
 */
public @interface CrossSite {
    String hostVar() default "crossSiteRpcHost";
}
