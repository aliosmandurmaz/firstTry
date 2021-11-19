package com.osman.denemeUygulamasi.service;

import com.osman.denemeUygulamasi.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomer(Integer id);

    List<Customer> listCustomer();

    Customer createCustomer(Customer cus);

    void deleteCustomer(Integer id);

    List<Customer> findByContactName(Customer cus);
}
