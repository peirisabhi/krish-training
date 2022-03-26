package com.krishantha.training.salesmanager.repository;

import com.krishantha.training.salesmanager.model.Employee;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 22/03/2022
 * Time: 8:51 pm
 */
public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
