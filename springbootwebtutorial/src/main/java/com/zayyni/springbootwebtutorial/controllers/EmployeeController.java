package com.zayyni.springbootwebtutorial.controllers;

import com.zayyni.springbootwebtutorial.dto.EmployeeDto;
import com.zayyni.springbootwebtutorial.entities.EmployeeEntity;
import com.zayyni.springbootwebtutorial.repositories.EmployeeRepository;
import com.zayyni.springbootwebtutorial.services.EmployeeService;
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

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees(@RequestParam(required = false) Integer age,
                                             @RequestParam(required = false) String sortBy) {
       return employeeService.getAllEmployees();
    }


    @PostMapping
    public EmployeeDto createNewEmployee(@RequestBody EmployeeDto inputEmployee) {
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping
    public String updateEmployee(){
        return "Hello from Put Controller";
    }


}
