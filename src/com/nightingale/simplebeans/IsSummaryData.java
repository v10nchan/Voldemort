/*
 * Copyright 2014 by Nightingale Informatix Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author Arvinder Channey
 */

package com.nightingale.simplebeans;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Any class implementing this interface must owner the contract to implement
 * equals and hash code methods. Thanks in advance. @achanney
 */
public interface IsSummaryData extends IsSerializable {
    java.sql.Timestamp getCreated();
}
