package com.zayyni.testingapp.services.impl;

import com.zayyni.testingapp.TestContainerConfiguration;
import com.zayyni.testingapp.dto.EmployeeDto;
import com.zayyni.testingapp.entities.Employee;
import com.zayyni.testingapp.repositories.EmployeeRepository;
import com.zayyni.testingapp.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Import(TestContainerConfiguration.class)
@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository employeeRepository;


    @Spy
    private ModelMapper modelMapper;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private Employee mockEmployee;

    private EmployeeDto mockEmployeeDto;

    @BeforeEach
    void setUp() {

        mockEmployee = Employee.builder()
                .id(1L)
                .name("John")
                .email("john@example.com")
                .salary(25115.77)
                .build();

        mockEmployeeDto = modelMapper.map(mockEmployee, EmployeeDto.class);

    }

    @Test
    void testGetEmployeeById_whenEmployeeIdIsPresent_thenReturnEmployeeDto()
    {
        employeeService.getEmployeeById(1L);

//        Assign
        Long id = mockEmployee.getId();
        when(employeeRepository.findById(id))
                .thenReturn(Optional.of(mockEmployee)); //stubbing
//        Act

        EmployeeDto employeeDto = employeeService.getEmployeeById(id);

//        Assert
        assertThat(employeeDto).isNotNull();
        assertThat(employeeDto.getId()).isEqualTo(id);
        assertThat(employeeDto.getName()).isEqualTo(mockEmployee.getName());
        assertThat(employeeDto.getEmail()).isEqualTo(mockEmployee.getEmail());
        assertThat(employeeDto.getSalary()).isEqualTo(mockEmployee.getSalary());

        verify(employeeRepository,only()).findById(id);
    }


    @Test
    void testCreateNewEmployee_whenValidEmployee_thenCreateNewEmployee()
    {
//        Assign
        when(employeeRepository.findByEmail(anyString()))
                .thenReturn(List.of());
        when(employeeRepository.save(any(Employee.class)))
                .thenReturn(mockEmployee);

//        Act

        EmployeeDto employeeDto = employeeService.createNewEmployee(mockEmployeeDto);

//        Assert

        assertThat(employeeDto).isNotNull();
        assertThat(employeeDto.getName()).isEqualTo(mockEmployee.getName());
        assertThat(employeeDto.getEmail()).isEqualTo(mockEmployee.getEmail());
        assertThat(employeeDto.getSalary()).isEqualTo(mockEmployee.getSalary());

        ArgumentCaptor<Employee> employeeCaptor = ArgumentCaptor.forClass(Employee.class);

        verify(employeeRepository,only()).save(employeeCaptor.capture());
        Employee capturedEmployee = employeeCaptor.getValue();
        assertThat(capturedEmployee.getId()).isEqualTo(1L);
        assertThat(capturedEmployee.getName()).isEqualTo(mockEmployee.getName());
        assertThat(capturedEmployee.getEmail()).isEqualTo(mockEmployee.getEmail());
        assertThat(capturedEmployee.getSalary()).isEqualTo(mockEmployee.getSalary());
    }
}