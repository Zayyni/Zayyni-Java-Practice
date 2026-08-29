package com.zayyni.testingapp.services.impl;

import com.zayyni.testingapp.dto.EmployeeDto;
import com.zayyni.testingapp.entities.Employee;
import com.zayyni.testingapp.exceptions.ResourceNotFoundException;
import com.zayyni.testingapp.repositories.EmployeeRepository;
import com.zayyni.testingapp.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        log.info("getEmployeeById");
        Employee employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee with id " + id + " not found")
        );
        log.info("got employee " + employee);
        return modelMapper.map(employee, EmployeeDto.class);
    };

    @Override
    public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
        List<Employee> existingEmployees = employeeRepository.findByEmail(employeeDto.getEmail());
        if (!existingEmployees.isEmpty()) {
            throw new RuntimeException("Employee with email " + employeeDto.getEmail() + " already exists");
        }
        Employee newEmployee = modelMapper.map(employeeDto, Employee.class);
        Employee savedEmployee = employeeRepository.save(newEmployee);
        return modelMapper.map(savedEmployee, EmployeeDto.class);
         };

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        Employee employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee with id " + id + " not found")
        );
        if (!employee.getEmail().equals(employeeDto.getEmail())) {
            throw new RuntimeException("Employee with email " + employeeDto.getEmail() + " does not exist");
        }
        employee.setEmail(employeeDto.getEmail());
        return modelMapper.map(employeeRepository.save(employee), EmployeeDto.class);
    }

    @Override
    public void deleteEmployee(Long id) {
        boolean exists = employeeRepository.existsById(id);
        if (!exists) {
            throw new RuntimeException("Employee with id " + id + " does not exist");
        }
        employeeRepository.deleteById(id);
    }
}
