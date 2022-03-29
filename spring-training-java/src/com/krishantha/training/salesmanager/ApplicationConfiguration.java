package com.krishantha.training.salesmanager;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 26/03/2022
 * Time: 11:25 pm
 */
@Configuration
public class ApplicationConfiguration {

    @Bean(name = "employeeService")
    public EmployeeService getEmployeeService() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.setEmployeeRepository(getEmployeeRepository());
        return employeeService;
    }

    @Bean(name = "employeeRepository")
    public EmployeeRepository getEmployeeRepository() {
        return new HibernateEmployeeRepositoryImpl();
    }

}
