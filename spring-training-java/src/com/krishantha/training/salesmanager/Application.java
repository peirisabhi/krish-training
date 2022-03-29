package com.krishantha.training.salesmanager;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 23/03/2022
 * Time: 9:12 am
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        EmployeeService employeeService = applicationContext
                .getBean("employeeService", EmployeeService.class);

        List<Employee> employees = employeeService.getAllEmployees();

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
        }

    }

}
