package com.osman.denemeUygulamasi.repository;

import com.osman.denemeUygulamasi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    List<Customer> findAllByContactNameAndCountry(String conName, String country);
}
