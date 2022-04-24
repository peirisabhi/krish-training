package com.abhishek.rentcloud.configconsumer.controller;

import com.abhishek.rentcloud.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 24/04/2022
 * Time: 1:20 pm
 */
@Controller
public class ProfileController1 {
    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping("/profile1")
    public String getConfig(Model model){

        model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min", memberProfileConfiguration.getMinRentPeriod());
        return "mprofile";
    }
}
