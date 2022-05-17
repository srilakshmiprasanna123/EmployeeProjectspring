package com.example.employeeproject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class EmployeeDTO {


    public String fullName;
    public String profilePic;
    public String salary;
    public String email;
    public String mobileNumber;
    public String startDate;
}
