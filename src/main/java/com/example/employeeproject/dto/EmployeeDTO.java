package com.example.employeeproject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class EmployeeDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee name is not valid")
    public String fullName;
    public String profilePic;

    @Min(value = 10000, message = "salaray ")
    public String salary;

    @Email(message = "Enter the email as null")
   public String email;

    @NotNull(message = "Please Enter the mobile number.....")
    public String mobileNumber;

    public String startDate;
}
