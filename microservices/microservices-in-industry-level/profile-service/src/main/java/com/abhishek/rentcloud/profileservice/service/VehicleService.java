package com.abhishek.rentcloud.profileservice.service;

import com.abhishek.rentcloud.commons.model.Vehicle;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 9:09 pm
 */
public interface VehicleService {

    Vehicle save (Vehicle vehicle);

    List<Vehicle> fetchAllVehicles();

}
