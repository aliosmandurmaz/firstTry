package com.osman.denemeUygulamasi.repository;

import com.osman.denemeUygulamasi.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface CityRepository extends JpaRepository<City,Integer> {

    List<City> findByName(String name);

    //City save();
}
