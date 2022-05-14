package com.example.employeeproject.controller;


import com.example.employeeproject.model.Employee;
import com.example.employeeproject.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/emp")
    public Employee sayPostHello(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return newEmployee;
    }
}
