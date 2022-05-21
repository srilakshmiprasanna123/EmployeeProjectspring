package com.example.employeeproject.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor


public @ToString class  EmployeeDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee name is not valid")
    public String fullName;
    public String profilePic;

    @Min(value = 50000, message = "Min wage should be more than 50000 ")
    public String salary;

    @Email(message = "Enter the email as null")
   public String email;

    @NotNull(message = "Please Enter the mobile number.....")
    public String mobileNumber;

    @JsonFormat(pattern = "dd MM yyyy")
    @PastOrPresent
    public LocalDate startDate;


    public List<String> department;

    public String gender;
    public String note;
}
