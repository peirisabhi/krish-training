package com.abhishek.rentcloud.profileservice.controller;


import com.abhishek.rentcloud.commons.model.Customer;
import com.abhishek.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 3:29 pm
 */

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

}
