package com.example.employeeproject.service;

import com.example.employeeproject.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeServices iEmployeeServices;

    public Employee addEmployee (Employee employee) {
        Employee newemployee = new Employee(employee);
        iEmployeeServices.save(newemployee);
         return newemployee;
    }

    public Optional<Employee> sayHelloById(int id) {
        return iEmployeeServices.findById(id);

    }

    public List<Employee> sayHelloAll() {
        return iEmployeeServices.findAll();

    }

    public Employee editData(int id, Employee employee) {
        employee.setId(id);
        iEmployeeServices.save(employee);                  //
        return employee;
    }

    public String removeById(int id) {
        Optional<Employee> newEmployee = iEmployeeServices.findById(id);
        if (newEmployee.isPresent()) {
            iEmployeeServices.delete(newEmployee.get());
            return "Record is deleted with id " + id;
        }
        return "Record not Found";
    }





}
