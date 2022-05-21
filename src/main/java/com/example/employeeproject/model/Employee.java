package com.example.employeeproject.model;

import com.example.employeeproject.dto.EmployeeDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.util.List;



@Entity
@RequiredArgsConstructor


public @Data class Employee {
    @Id
    @GeneratedValue
    public int id;
    public String fullName;
    public String profilePic;

    public String gender;

    public String note;
   @ElementCollection
    public List<String> department;

    public String salary;

    public String email;
    public String mobileNumber;

    @JsonFormat(pattern = "dd MM yyyy")
    @PastOrPresent
     LocalDate startDate;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.fullName = employeeDTO.fullName;
        this.profilePic = employeeDTO.profilePic;
        this.gender = employeeDTO.gender;
        this.email = employeeDTO.email;
        this.department = employeeDTO.department;
        this.mobileNumber = employeeDTO.mobileNumber;
        this.note = employeeDTO.note;
        this.salary = employeeDTO.salary;
        this.startDate = employeeDTO.startDate;
    }

    public Employee(Employee employee) {
        this.id = employee.id;
        this.fullName = employee.fullName;
        this.profilePic = employee.profilePic;
        this.gender = employee.gender;
        this.email = employee.email;
        this.department = employee.department;
        this.mobileNumber = employee.mobileNumber;
        this.note = employee.note;
        this.salary = employee.salary;
        this.startDate = employee.startDate;

    }
    public Employee(EmployeeDTO employeeDTO) {
        this.fullName = employeeDTO.fullName;
        this.profilePic = employeeDTO.profilePic;
        this.gender = employeeDTO.gender;
        this.email = employeeDTO.email;
        this.department = employeeDTO.department;
        this.mobileNumber = employeeDTO.mobileNumber;
        this.note = employeeDTO.note;
        this.salary = employeeDTO.salary;
        this.startDate = employeeDTO.startDate;
    }
}
