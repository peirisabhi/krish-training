package com.abhishek.rentcloud.profileservice.controller;

import com.abhishek.rentcloud.commons.model.Customer;
import com.abhishek.rentcloud.commons.model.Vehicle;
import com.abhishek.rentcloud.profileservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 9:12 pm
 */
@RestController
@RequestMapping(value = "/services")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @RequestMapping(value = "/vehicle", method = RequestMethod.GET)
    public List<Vehicle> fetchAllVehicles(){
        return vehicleService.fetchAllVehicles();
    }

}
