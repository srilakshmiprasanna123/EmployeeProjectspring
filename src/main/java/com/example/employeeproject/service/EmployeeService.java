package com.example.employeeproject.service;

import com.example.employeeproject.dto.EmployeeDTO;
import com.example.employeeproject.model.Employee;

import com.example.employeeproject.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepository iEmployeeRepository;
    public Employee addEmployee (Employee employee) {
        Employee newemployee = new Employee(employee);
        iEmployeeRepository.save(newemployee);
         return newemployee;
    }

    public Optional<Employee> getById(int id) {
        return iEmployeeRepository.findById(id);

    }

    public List<Employee> allData() {
        return iEmployeeRepository.findAll();

    }

    public String editData(int id, EmployeeDTO employeeDTO) {

        if (iEmployeeRepository.findById(id).isPresent()) {
            Employee employee1 = new Employee(id, employeeDTO);
            Employee alpha = iEmployeeRepository.save(employee1);
            return "This is the result"+ alpha;
        }
        return "No Match";
    }


    public String removeById(int id) {
        Optional<Employee> newEmployee = iEmployeeRepository.findById(id);
        if (newEmployee.isPresent()) {
            iEmployeeRepository.delete(newEmployee.get());
            return "Record is deleted with id " + id;
        }
        return "Record not Found";
    }
}
