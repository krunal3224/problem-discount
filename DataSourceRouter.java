package com.eprocurement.common.web.security.configure;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouter extends AbstractRoutingDataSource {

	public static enum DataSourceType
	{
		defaultSource, longProcessSource
	}
	
	@Override
	protected Object determineCurrentLookupKey() {
		DataSourceType dataSourceName = DataSourceType.defaultSource;
		
		DataSourceType localName = dataSourceNameThreadLocal.get();
		if(localName != null)
			dataSourceName = localName;
		
		return dataSourceName;
	}


	public static final ThreadLocal<DataSourceType> dataSourceNameThreadLocal = new ThreadLocal<DataSourceType>();

    public static void set(DataSourceType dataSourceType) {
    	dataSourceNameThreadLocal.set(dataSourceType);
    }

    public static void unset() {
    	dataSourceNameThreadLocal.remove();
    }

    public static DataSourceType get() {
        return dataSourceNameThreadLocal.get();
    }
}
