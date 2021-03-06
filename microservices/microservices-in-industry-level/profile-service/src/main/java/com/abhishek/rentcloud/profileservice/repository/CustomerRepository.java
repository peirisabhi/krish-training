package com.abhishek.rentcloud.profileservice.repository;

import com.abhishek.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 5:05 pm
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
