package com.osman.denemeUygulamasi.controller;

import com.osman.denemeUygulamasi.constant.ApiEndpoints;
import com.osman.denemeUygulamasi.domain.Customer;
import com.osman.denemeUygulamasi.model.CustomerDTO;
import com.osman.denemeUygulamasi.payload.SuccessResponse;
import com.osman.denemeUygulamasi.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @RequestMapping(value = ApiEndpoints.GET_CUSTOMER, method = RequestMethod.GET)
    public ResponseEntity<?> getCustomer(@RequestParam(value = "id") Integer id){

        return ResponseEntity.ok(new SuccessResponse(customerServiceImpl.getCustomer(id)));
    }

    @RequestMapping(value = ApiEndpoints.LIST_CUSTOMER, method = RequestMethod.GET)
    public ResponseEntity<?> getCustomer(){

        return ResponseEntity.ok(new SuccessResponse(customerServiceImpl.listCustomer()));
    }

    @RequestMapping(value = ApiEndpoints.CREATE_CUSTOMER, method = RequestMethod.POST)
    public ResponseEntity<?> createCustomer(@RequestBody CustomerDTO dto){

        Customer cus = new Customer();
        cus.setCustomerName(dto.getCustomerName());
        cus.setCity(dto.getCity());
        cus.setCountry(dto.getCountry());
        cus.setContactName(dto.getContactName());

        return ResponseEntity.ok(new SuccessResponse(customerServiceImpl.createCustomer(cus)));
    }

    @RequestMapping(value = ApiEndpoints.UPDATE_CUSTOMER, method = RequestMethod.POST)
    public ResponseEntity<?> updateCustomer(@RequestBody CustomerDTO dto){

        Customer cus = new Customer();
        cus.setId(dto.getId());
        cus.setCustomerName(dto.getCustomerName());
        cus.setCity(dto.getCity() + " " + dto.getAddress());
        cus.setCountry(dto.getCountry());
        cus.setContactName(dto.getContactName());

        return ResponseEntity.ok(new SuccessResponse(customerServiceImpl.createCustomer(cus)));
    }

    @RequestMapping(value = ApiEndpoints.DELETE_CUSTOMER, method = RequestMethod.POST)
    public ResponseEntity<?> deleteCustomer(@RequestBody CustomerDTO dto){
        customerServiceImpl.deleteCustomer(dto.getId());
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    @RequestMapping(value = ApiEndpoints.FIND_BY_CONTACT_NAME, method = RequestMethod.POST)
    public ResponseEntity<?> findByContactName(@RequestBody CustomerDTO dto){
        Customer customer = new Customer();
        customer.setContactName(dto.getContactName());
        customer.setCountry(dto.getCountry());
        return ResponseEntity.ok(new SuccessResponse(customerServiceImpl.findByContactName(customer)));
    }

}
