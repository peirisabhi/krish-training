package com.abhishek.rentacar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 19/04/2022
 * Time: 4:22 pm
 */

@RestController
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Springboot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Springboot from post";
    }



}
