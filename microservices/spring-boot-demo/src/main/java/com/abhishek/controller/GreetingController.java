package com.abhishek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 01/04/2022
 * Time: 9:51 pm
 */
@RestController
public class GreetingController {

    @RequestMapping("/")
    public String greeting(){
        return "<h1>Welcome to Krish training...</h1>";
    }

}
