package com.osman.denemeUygulamasi.constant;

public final class ApiEndpoints {
    private ApiEndpoints(){
    }

    public static final String BASE_API_URL = "/api";
    public static final String GET_CUSTOMER = BASE_API_URL + "/getCustomer";
    public static final String LIST_CUSTOMER = BASE_API_URL + "/listCustomer";
    public static final String CREATE_CUSTOMER = BASE_API_URL + "/createCustomer";
    public static final String UPDATE_CUSTOMER = BASE_API_URL + "/updateCustomer";
    public static final String DELETE_CUSTOMER = BASE_API_URL + "/deleteCustomer";
    public static final String FIND_BY_CONTACT_NAME = BASE_API_URL + "/findByContactName";
}
