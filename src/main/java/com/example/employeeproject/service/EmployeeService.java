package com.example.employeeproject.service;

import com.example.employeeproject.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeServices iEmployeeServices;

    public Employee addEmployee (Employee employee) {
        Employee newemployee = new Employee(employee);
        iEmployeeServices.save(newemployee);
         return newemployee;
    }



}
