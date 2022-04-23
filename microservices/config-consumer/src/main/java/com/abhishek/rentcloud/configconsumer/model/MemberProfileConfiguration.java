package com.abhishek.rentcloud.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 23/04/2022
 * Time: 11:29 pm
 */
@Component
public class MemberProfileConfiguration {

    @Autowired
    Environment environment;

    public String getDefaultModel(){
        return environment.getProperty("vehicle.default.model");
    }

    public String getMinRentPeriod(){
        return environment.getProperty("member.rent.min");
    }

}
