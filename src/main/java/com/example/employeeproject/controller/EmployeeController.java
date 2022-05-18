package com.example.employeeproject.controller;

import com.example.employeeproject.dto.EmployeeDTO;
import com.example.employeeproject.dto.ResponseDTO;
import com.example.employeeproject.model.Employee;
import com.example.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController

@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/post")
    public ResponseEntity<ResponseDTO> createEmployees(@Valid @RequestBody EmployeeDTO employeeDTO) {
        Employee employee1 = new Employee(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Employee Created Successfully", employeeService.addEmployee(employee1));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getById(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("Employee Get", employeeService.getById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<ResponseDTO> allData() {
        ResponseDTO responseDTO = new ResponseDTO("Getting all the record..", employeeService.allData());
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO> editData(@Valid @PathVariable int id, @RequestBody EmployeeDTO employeeDTO) {
        ResponseDTO responseDTO = new ResponseDTO("edit", employeeService.editData(id, employeeDTO));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ResponseDTO> removeById(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("delete", employeeService.removeById(id));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
}
