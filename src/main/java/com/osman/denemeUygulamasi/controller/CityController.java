package com.osman.denemeUygulamasi.controller;

import com.osman.denemeUygulamasi.constant.ApiEndpoints;
import com.osman.denemeUygulamasi.domain.City;
import com.osman.denemeUygulamasi.model.CityDTO;
import com.osman.denemeUygulamasi.payload.SuccessResponse;
import com.osman.denemeUygulamasi.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {

    @Autowired
    CityServiceImpl cityServiceImpl;

    @RequestMapping(value = ApiEndpoints.GET_CITY, method = RequestMethod.GET)
    public ResponseEntity<?> getCity(@RequestParam(value = "id") Integer id) {
        return ResponseEntity.ok(new SuccessResponse(cityServiceImpl.getCity(id)));

    }

    @RequestMapping(value = ApiEndpoints.LIST_CITY, method = RequestMethod.GET)
    public ResponseEntity<?> getCity() {
        return ResponseEntity.ok(new SuccessResponse(cityServiceImpl.listCity()));
    }

    @RequestMapping(value = ApiEndpoints.CREATE_CITY, method = RequestMethod.POST)
    public ResponseEntity<?> createCity(@RequestBody CityDTO dto) {

        City city = new City();
        city.setName(dto.getName());
        city.setId(dto.getId());

        return ResponseEntity.ok(new SuccessResponse(cityServiceImpl.createCity(city)));
    }

   /* @RequestMapping(value = ApiEndpoints.UPDATE_CITY, method = RequestMethod.POST)
    public ResponseEntity<?> updateCity(@RequestBody CityDTO dto) {
        City city = new City();
        city.setId(dto.getId());
        city.setName(dto.getName());

        return ResponseEntity.ok(new SuccessResponse(cityServiceImpl.updateCity(city)));
    }*/

    @RequestMapping(value = ApiEndpoints.DELETE_CITY, method = RequestMethod.POST)
    public ResponseEntity<?> deleteCity(@RequestBody CityDTO dto) {
        cityServiceImpl.deleteCity(dto.getId());
        return ResponseEntity.ok(new SuccessResponse(null));
    }

    @RequestMapping(value = ApiEndpoints.FIND_BY_NAME , method = RequestMethod.POST)
    public ResponseEntity<?> findByName(@RequestBody CityDTO dto) {

        City city = new City();
        city.setName(dto.getName());

        return ResponseEntity.ok(new SuccessResponse(cityServiceImpl.findByName(city)));
    }

}
