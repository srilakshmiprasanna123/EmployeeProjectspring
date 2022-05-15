package com.example.employeeproject.controller;

import com.example.employeeproject.model.Employee;
import com.example.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/emp")
    public Employee sayPostHello(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return newEmployee;

    }

    @GetMapping("/get/{id}")
    public Optional<Employee> sayHelloById(@PathVariable int id) {
        Optional<Employee> response = employeeService.sayHelloById(id);
        return response;
    }

    @GetMapping("/Lucky")
    public List<Employee> sayHelloAll() {
        List<Employee> response = employeeService.sayHelloAll();
        return response;
    }

    @PutMapping("/edit/{id}")
    public Employee editData(@PathVariable int id, @RequestBody Employee user) {
        Employee newUser = employeeService.editData(id, user);
        return newUser;
    }

    @DeleteMapping("/remove/{id}")
    public String removeById(@PathVariable int id) {
        String response = employeeService.removeById(id);
        return response;
    }
}
