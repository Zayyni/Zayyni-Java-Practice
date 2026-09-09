package com.zayyni.cachingapp.services.impl;

import com.zayyni.cachingapp.dto.EmployeeDto;
import com.zayyni.cachingapp.entities.Employee;
import com.zayyni.cachingapp.exceptions.ResourceNotFoundException;
import com.zayyni.cachingapp.repositories.EmployeeRepository;
import com.zayyni.cachingapp.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;
    private final String CACHE_NAME = "employees";

    @Override
    @Cacheable(cacheNames = CACHE_NAME, key = "#id")
    public EmployeeDto getEmployeeById(Long id) {
        log.info("Getting employee by id: {}", id);
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> {
            return new ResourceNotFoundException("Employee not found with this Id" + id);
        });
        log.info("Employee found: {}", id);
        return modelMapper.map(employee, EmployeeDto.class);
    }

    @Override
    @CachePut(cacheNames = CACHE_NAME, key = "#result.id")
    public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
        log.info("Creating new employee: {}", employeeDto.getEmail());
        List<Employee> existingEmployees = employeeRepository.findByEmail(employeeDto.getEmail());
        if (!existingEmployees.isEmpty()) {
            log.info("Employee with this email already exists: {}", employeeDto.getEmail());
            throw new RuntimeException("Employee with this email already exists");

        }
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        employee = employeeRepository.save(employee);
        log.info("New employee created: {}", employeeDto.getEmail());
        return modelMapper.map(employee, EmployeeDto.class);

    }

    @Override
    @CachePut(cacheNames = CACHE_NAME, key = "#id")
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        log.info("Updating employee: {}", employeeDto.getEmail());
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->{
                    log.info("Employee not found with this Id: {}", id);
                    return new ResourceNotFoundException("Employee with this id not found" + id);
                });
        if (!employeeDto.getEmail().equals(employee.getEmail())) {
            log.info("Attempted to update the employee with : {}", employeeDto.getEmail());
            throw new RuntimeException("Employee with this email already exists");
        }
        modelMapper.map(employeeDto, employee);
        employee.setId(id);
        Employee updatedEmployee = employeeRepository.save(employee);
        log.info("Employee updated: {}", employeeDto.getEmail());
        return modelMapper.map(updatedEmployee, EmployeeDto.class);

    }

    @Override
    public void deleteEmployee(Long id) {
        log.info("Deleting employee: {}", id);
        boolean exists = employeeRepository.existsById(id);
        if (!exists) {
            log.info("Employee not found with this Id : {}", id);
            throw new RuntimeException("Employee with this id not found");
        }
        employeeRepository.deleteById(id);
        log.info("Employee deleted: {}", id);
    }
}
