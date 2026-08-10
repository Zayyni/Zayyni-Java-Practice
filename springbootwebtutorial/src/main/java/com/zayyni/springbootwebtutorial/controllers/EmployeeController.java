package com.zayyni.springbootwebtutorial.controllers;

import com.zayyni.springbootwebtutorial.dto.EmployeeDto;
import com.zayyni.springbootwebtutorial.entities.EmployeeEntity;
import com.zayyni.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage() {
//        return "Secret message : #$@&AbDF";
//    }

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getEmployees(@RequestParam(required = false) Integer age,
                                             @RequestParam(required = false) String sortBy) {
       return employeeRepository.findAll();
    }


    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }

    @PutMapping
    public String updateEmployee(){
        return "Hello from Put Controller";
    }


}
