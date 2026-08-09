package com.zayyni.springbootwebtutorial.controllers;

import com.zayyni.springbootwebtutorial.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage() {
//        return "Secret message : #$@&AbDF";
//    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable(name = "employeeId") Long Id) {
        return new EmployeeDto(Id, "Zayyni", "zayyni@gmail.com", 24, LocalDate.of(2024,1,22),true);

    }

    @GetMapping
    public String getEmployees(@RequestParam(required = false) Integer age,
                               @RequestParam(required = false) String sortBy) {
        return "Hi age is " + age + " and sort by " + sortBy;
    }


    @PostMapping
    public String createNewEmployee(){
        return "Hello from Post Controller";
    }

    @PutMapping
    public String updateEmployee(){
        return "Hello from Put Controller";
    }


}
