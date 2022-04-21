package com.abhishek.rentacar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 21/04/2022
 * Time: 2:28 pm
 */

@Entity
@Table(name = "student")
public class Student {

    @Id
    private int id;

    private String fname;

    private String lname;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
