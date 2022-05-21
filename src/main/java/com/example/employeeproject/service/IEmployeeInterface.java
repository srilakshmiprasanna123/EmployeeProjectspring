package com.example.employeeproject.service;

import com.example.employeeproject.dto.EmployeeDTO;
import com.example.employeeproject.model.Employee;


import java.util.List;

public interface IEmployeeInterface {

    String removeById(int id);

    String editById(int id, EmployeeDTO employee);

    List<Employee> getEmployeeByDepartment(String department);

    List<Employee> searchAll();

    Employee searchById(int id);

    Employee addEmployee(Employee employee);

}
