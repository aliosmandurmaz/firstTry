package com.osman.denemeUygulamasi.controller;

import com.osman.denemeUygulamasi.constant.ApiEndpoints;
import com.osman.denemeUygulamasi.domain.Customer;
import com.osman.denemeUygulamasi.model.CustomerDTO;
import com.osman.denemeUygulamasi.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @RequestMapping(value = ApiEndpoints.GET_CUSTOMER, method = RequestMethod.GET)
    public Customer getCustomer(@RequestParam(value = "id") Integer id){

        return customerServiceImpl.getCustomer(id);
    }

    @RequestMapping(value = ApiEndpoints.LIST_CUSTOMER, method = RequestMethod.GET)
    public List<Customer> getCustomer(){

        return customerServiceImpl.listCustomer();
    }

    @RequestMapping(value = ApiEndpoints.CREATE_CUSTOMER, method = RequestMethod.POST)
    public Customer createCustomer(@RequestBody CustomerDTO dto){

        Customer cus = new Customer();
        cus.setCustomerName(dto.getCustomerName());
        cus.setCity(dto.getCity());
        cus.setCountry(dto.getCountry());
        cus.setContactName(dto.getContactName());

        return customerServiceImpl.createCustomer(cus);
    }

    @RequestMapping(value = ApiEndpoints.UPDATE_CUSTOMER, method = RequestMethod.POST)
    public Customer updateCustomer(@RequestBody CustomerDTO dto){

        Customer cus = new Customer();
        cus.setId(dto.getId());
        cus.setCustomerName(dto.getCustomerName());
        cus.setCity(dto.getCity() + " " + dto.getAddress());
        cus.setCountry(dto.getCountry());
        cus.setContactName(dto.getContactName());

        return customerServiceImpl.createCustomer(cus);
    }

    @RequestMapping(value = ApiEndpoints.DELETE_CUSTOMER, method = RequestMethod.POST)
    public void deleteCustomer(@RequestBody CustomerDTO dto){
        customerServiceImpl.deleteCustomer(dto.getId());
    }

    @RequestMapping(value = ApiEndpoints.FIND_BY_CONTACT_NAME, method = RequestMethod.POST)
    public List<Customer> findByContactName(@RequestBody CustomerDTO dto){
        Customer customer = new Customer();
        customer.setContactName(dto.getContactName());
        customer.setCountry(dto.getCountry());
        return customerServiceImpl.findByContactName(customer);
    }

}
