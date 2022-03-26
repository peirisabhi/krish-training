package com.krishantha.training.salesmanager.repository;

import com.krishantha.training.salesmanager.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 22/03/2022
 * Time: 8:43 pm
 */
@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmployeeName("Abhishek");
        employee.setEmployeeLocation("Negombo");
        employees.add(employee);

        return employees;
    }

}
