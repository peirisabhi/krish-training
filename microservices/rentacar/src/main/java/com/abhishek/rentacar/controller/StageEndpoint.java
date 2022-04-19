package com.abhishek.rentacar.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 19/04/2022
 * Time: 6:36 pm
 */
@Component
@Endpoint(id = "stage")
public class StageEndpoint {

    Map<String, Stage > stages = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Stage> getAllStages(){
        return stages;
    }

    @ReadOperation
    public Stage getStage(@Selector String name) {
        return stages.get(name);
    }

    @WriteOperation
    public void setStages(@Selector String name, int stage) {
        stages.put(name, new Stage(stage));
    }

    static class Stage{
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
