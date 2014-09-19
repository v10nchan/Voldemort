package com.nightingale.simplebeans; /*
 * Copyright 2013 by Nightingale Informatix Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author sjakubowski
 */

import com.medrium.annotation.DBExcludeField;
import com.medrium.xmlclient.annotation.XMLRPCIgnore;

public interface BaseTable {
    java.sql.Timestamp getLastUpdated();

    void setLastUpdated(java.sql.Timestamp lastupdated);

    @XMLRPCIgnore
    String getIpAddress();

    void setIpAddress(String id);

    java.sql.Timestamp getCreated();

    void setCreated(java.sql.Timestamp id);

    String getCreatedBy();

    void setCreatedBy(String id);

    String getUpdatedBy();

    void setUpdatedBy(String id);

    @DBExcludeField(excludeInsert=true, excludeSelect=true, excludeUpdate=true)
    @XMLRPCIgnore
    String getUpdatedByName();

    @DBExcludeField(excludeInsert=true, excludeSelect=true, excludeUpdate=true)
    void setUpdatedByName(String id);
}
