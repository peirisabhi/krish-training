package com.abhishek.rentcloud.profileservice.repository;

import com.abhishek.rentcloud.commons.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 9:09 pm
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
