/*
 *
 * Copyright 2013 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author ajayr
 */
package com.nightinagle.hl7.constants;

/**
 * Class to define Relationship constant and its value
 * @author ajayr
 *
 */
public class RelationshipConstant {

	// relationship id
	public static final int MOTHER_ID = 1;
	public static final int FATHAER_ID = 2;
	public static final int SISTER_ID = 3;
	public static final int BROTHER_ID = 4;
	public static final int DAUGHTER_ID = 12;
	public static final int SON_ID = 13;
	public static final int FRIEND_ID = 20;
	
	// relationship description
	public static final String MOTHER_ID_VALUE = "Mother";
	public static final String FATHAER_ID_VALUE = "Father";
	public static final String SISTER_ID_VALUE = "Sister";
	public static final String BROTHER_ID_VALUE = "Brother";
	public static final String DAUGHTER_ID_VALUE = "Daughter";
	public static final String SON_ID_VALUE = "Son";
	public static final String FRIEND_ID_VALUE = "Friend";
	public static final String GUARDIAN_VALUE = "Guardian";
	
	// relationship code
	public static final String MOTHER_CODE = "MTH";
	public static final String FATHAER_CODE = "FTH";
	public static final String SISTER_CODE = "SIS";
	public static final String BROTHER_CODE = "BRO";
	public static final String DAUGHTER_CODE = "DTH";
	public static final String SON_CODE = "SON";
	public static final String FRIEND_CODE = "FRD";
	public static final String GUARDIAN_CODE = "GRD";
}
