package com.nightinagle.hl7.test;

import javax.sql.DataSource;

import org.postgresql.ds.PGPoolingDataSource;

import com.google.inject.Provider;

public class NexiaSQLDataSourceProvider implements Provider<DataSource> {
private final DataSource _dataSource;
   
    
    public NexiaSQLDataSourceProvider() {        
       
       
        PGPoolingDataSource source = new PGPoolingDataSource();
                     
            source.setDataSourceName("nexia DB pool"); 
            source.setServerName("db-nexia"); 
            source.setDatabaseName("nexia");
            source.setUser("postgres");
            source.setPassword("aka1198"); 
            source.setMaxConnections(20);
        

        this._dataSource = source;            
        // Using PostgresSQL pool strategy doc: http://jdbc.postgresql.org/documentation/83/ds-ds.html
    }

    public DataSource get() {
        return _dataSource;
    }
}
