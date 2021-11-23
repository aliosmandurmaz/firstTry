package com.osman.denemeUygulamasi.service.impl;

import com.osman.denemeUygulamasi.domain.City;
import com.osman.denemeUygulamasi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public City getCity(Integer id) { return cityRepository.findById(id).orElse(null);}

    @Override
    public List<City> listCity() {return cityRepository.findAll();}

    @Override
    public City createCity(City city) { return cityRepository.save(city);}

    //@Override
    //public City updateCity(City city) { return cityRepository.save();}

    @Override
    public void deleteCity(Integer id) {  cityRepository.deleteById(id);}

    @Override
    public List<City> findByName(City city) { return cityRepository.findByName(city.getName());}






}
