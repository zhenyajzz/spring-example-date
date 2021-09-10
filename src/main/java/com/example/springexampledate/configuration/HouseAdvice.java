package com.example.springexampledate.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class HouseAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> methodAdvice(MethodArgumentNotValidException e) {
        List<String> errors = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(ex -> ex.getDefaultMessage())
                .collect(Collectors.toList());
        return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> methodAdvice2(ConstraintViolationException e) {
        List<String> errors = e.getConstraintViolations()
                .stream()
                .map(c -> c.getMessage())
                .collect(Collectors.toList());
        return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
    }
}