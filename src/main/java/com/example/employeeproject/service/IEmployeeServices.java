package com.example.employeeproject.service;

import com.example.employeeproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeServices extends JpaRepository<Employee, Integer> {
}
