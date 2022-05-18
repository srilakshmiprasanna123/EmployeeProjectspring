package com.example.employeeproject.service;

import com.example.employeeproject.dto.EmployeeDTO;
import com.example.employeeproject.exceptionhandler.EmployeeException;
import com.example.employeeproject.model.Employee;

import com.example.employeeproject.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService   {

    @Autowired
    IEmployeeRepository iEmployeeRepository;
    public Employee addEmployee (Employee employee) {
        Employee newemployee = new Employee(employee);
        iEmployeeRepository.save(newemployee);
         return newemployee;
    }

    public Employee getById(int id) {

        if (iEmployeeRepository.findById(id).isPresent()){
            Employee employee = new Employee(id);
            return employee;
        }
        else throw (new EmployeeException("Employee not Found"));
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
        else throw (new EmployeeException("id is not found"));
    }


    public String removeById(int id) {
        Optional<Employee> newEmployee = iEmployeeRepository.findById(id);
        if (newEmployee.isPresent()) {
            iEmployeeRepository.delete(newEmployee.get());
            return "Record is deleted with id " + id;
        }
        else throw (new EmployeeException("result not found"));
    }


}
