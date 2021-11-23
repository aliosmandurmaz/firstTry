package com.osman.denemeUygulamasi.service.impl;

import com.osman.denemeUygulamasi.domain.City;

import java.util.List;

public interface CityService {
    City getCity(Integer id);

    List<City> listCity();

    City createCity(City city);

   // City updateCity(City city);

    void deleteCity(Integer id);

    List<City> findByName(City city);
}
