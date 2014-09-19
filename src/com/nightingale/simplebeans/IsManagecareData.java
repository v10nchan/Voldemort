/*
 * Copyright 2014 by Nightingale Informatix Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author Tarsicius Rodrigues
 */

package com.nightingale.simplebeans;

import com.google.gwt.user.client.rpc.IsSerializable;

public interface IsManagecareData extends IsSerializable {
    public int getID();
    public String getDescription();
}
