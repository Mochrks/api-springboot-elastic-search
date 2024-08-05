package com.springboot_elastic.elastic_search.common;

public class Urls {
    // customers
    public static final String CUSTOMERS_BASE = "/customers";
    public static final String CREATE_CUSTOMER_ELASTIC = CUSTOMERS_BASE + "/elastic/create";
    public static final String GET_ALL_CUSTOMERS_ELASTIC = CUSTOMERS_BASE + "/elastic/all";
    public static final String SEARCH_CUSTOMERS_ELASTIC = CUSTOMERS_BASE + "/elastic/search";
    public static final String BULK_DATA = CUSTOMERS_BASE + "/bulk-create";
}
