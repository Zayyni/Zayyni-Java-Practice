package com.zayyni.prodreadyfeatures.clients;

import com.zayyni.prodreadyfeatures.dto.EmployeeDto;

import java.util.List;

public interface EmployeeClient {

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getEmployeeById(Long employeeId);

    EmployeeDto createNewEmployee(EmployeeDto employeeDto);
}
