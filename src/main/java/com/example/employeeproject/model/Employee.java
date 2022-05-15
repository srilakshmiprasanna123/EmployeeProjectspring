package com.example.employeeproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity


public class Employee {
    @Id
    @GeneratedValue
    public int id;
    public String fullName;
    public String profilePic;
    public String salary;
    public String email;
    public String mobileNumber;
    public String startDate;

    public Employee(int id, String fullName, String profilePic, String salary, String email, String mobileNumber, String startDate) {
        this.id = id;
        this.fullName = fullName;
        this.profilePic = profilePic;
        this.salary = salary;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.startDate = startDate;
    }

    public Employee() {
    }

    public Employee(Employee employee) {
        this.id = employee.id;
        this.fullName = employee.fullName;
        this.profilePic = employee.profilePic;
        this.salary = employee.salary;
        this.email = employee.email;
        this.mobileNumber = employee.mobileNumber;
        this.startDate = employee.startDate;
    }






    public int Employee(int id) {
        return id;
    }

//    public Employee(int id, Employee employee) {
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", salary='" + salary + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
