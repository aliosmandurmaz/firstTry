package com.osman.denemeUygulamasi.service.impl;

import com.osman.denemeUygulamasi.domain.Customer;
import com.osman.denemeUygulamasi.repository.CustomerRepository;
import com.osman.denemeUygulamasi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Integer id){
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> listCustomer(){
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer cus){
        return customerRepository.save(cus);
    }

    @Override
    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findByContactName(Customer cus){
        return customerRepository.findAllByContactNameAndCountry(cus.getContactName(), cus.getCountry());
    }

}
