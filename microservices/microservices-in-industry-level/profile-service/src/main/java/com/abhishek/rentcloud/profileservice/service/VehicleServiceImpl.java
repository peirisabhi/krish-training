package com.abhishek.rentcloud.profileservice.service;

import com.abhishek.rentcloud.commons.model.Vehicle;
import com.abhishek.rentcloud.profileservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 9:10 pm
 */
@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> fetchAllVehicles() {
        return vehicleRepository.findAll();
    }
}
