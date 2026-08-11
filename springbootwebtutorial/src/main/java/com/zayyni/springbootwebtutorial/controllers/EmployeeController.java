package com.zayyni.springbootwebtutorial.controllers;

import com.zayyni.springbootwebtutorial.dto.EmployeeDto;
import com.zayyni.springbootwebtutorial.entities.EmployeeEntity;
import com.zayyni.springbootwebtutorial.repositories.EmployeeRepository;
import com.zayyni.springbootwebtutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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

    @PutMapping(path = "/{employeeId}")
    public EmployeeDto updateEmployeeById(@RequestBody EmployeeDto employeeDto, @PathVariable Long employeeId) {
        return employeeService.updateEmployeeById(employeeDto,employeeId);
    }

    @DeleteMapping(path = "/{employeeId}")
    public boolean deleteEmployeeById(@PathVariable Long employeeId) {
        return employeeService.deleteEmployeeById(employeeId);
    }

    @PatchMapping(path = "/{employeeId}")
    public EmployeeDto updatePartialEmployeeById(@RequestBody Map<String, Object> updates, @PathVariable Long employeeId) {
    return employeeService.updatePartialEmployeeById(updates,employeeId);
    }



}
