package com.abhishek.rentcloud.profileservice.service;

import com.abhishek.rentcloud.commons.model.Customer;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 5:06 pm
 */
public interface CustomerService {

    Customer save (Customer customer);

    Customer fetchCustomerById(int id);

    List<Customer> fetchAllCustomers();
}
