package com.example.employeeproject.exceptionhandler;

import com.example.employeeproject.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(EmployeeException exception){

        ResponseDTO responseDTO = new ResponseDTO("Exception while parsing Rest request",exception.getMessage());
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
