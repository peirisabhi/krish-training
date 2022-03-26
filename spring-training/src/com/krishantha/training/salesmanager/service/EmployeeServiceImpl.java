package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 22/03/2022
 * Time: 8:51 pm
 */
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }
}
