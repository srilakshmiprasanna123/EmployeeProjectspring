package com.example.employeeproject.controller;

import com.example.employeeproject.dto.EmployeeDTO;
import com.example.employeeproject.dto.ResponseDTO;
import com.example.employeeproject.model.Employee;
import com.example.employeeproject.repository.IEmployeeRepository;
import com.example.employeeproject.service.EmployeeService;
import com.example.employeeproject.service.IEmployeeInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
    @Autowired
    IEmployeeInterface iEmployeeInterface;

    @PostMapping("/post")
    public ResponseEntity<ResponseDTO> createEmployees(@Valid @RequestBody EmployeeDTO employeeDTO) {
        Employee employee1 = new Employee(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Employee Created Successfully", iEmployeeInterface.addEmployee(employee1));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> searchById(@PathVariable int id){
        ResponseDTO responseDTO = new ResponseDTO("Record found successfully", iEmployeeInterface.searchById(id));
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }


    @GetMapping("/getall")
    public ResponseEntity<ResponseDTO> allData() {
        ResponseDTO responseDTO = new ResponseDTO("Getting all the record..", iEmployeeInterface.searchAll());
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO> editData(@Valid @PathVariable int id, @RequestBody EmployeeDTO employeeDTO) {
        ResponseDTO responseDTO = new ResponseDTO("edit", iEmployeeInterface.editById(id, employeeDTO));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ResponseDTO> removeById(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("delete", iEmployeeInterface.removeById(id));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/dept/{department}")
    public ResponseEntity<ResponseDTO> getEmployeeByDepartment(@PathVariable("department") String department){
        List<Employee> employeeList = iEmployeeInterface.getEmployeeByDepartment(department);
        ResponseDTO responseDTO = new ResponseDTO("Get Call for ID successful",employeeList);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }


}
