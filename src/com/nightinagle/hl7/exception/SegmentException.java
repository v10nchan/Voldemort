/*
 *
 * Copyright 2013 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author sudhakars
 */
package com.nightinagle.hl7.exception;

/**
 * Class to throw user define exception
 * @author ajayr
 *
 */
public class SegmentException extends Exception{

	public SegmentException(String message, Throwable cause){
		super(message, cause);
	}
	
}
