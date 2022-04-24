package com.abhishek.rentcloud.profileservice.service;

import com.abhishek.rentcloud.commons.model.Customer;
import com.abhishek.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Customer fetchCustomerById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }
        return null;
    }

    @Override
    public List<Customer> fetchAllCustomers() {
        return customerRepository.findAll();
    }
}
