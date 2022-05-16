package com.example.employeeproject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO {

    public int id;
    public String fullName;
    public String profilePic;
    public String salary;
    public String email;
    public String mobileNumber;
    public String startDate;
}
