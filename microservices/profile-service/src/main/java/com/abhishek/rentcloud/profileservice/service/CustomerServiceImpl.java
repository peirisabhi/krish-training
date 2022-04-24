package com.abhishek.rentcloud.profileservice.service;

import com.abhishek.rentcloud.commons.model.Customer;
import com.abhishek.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 5:07 pm
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
