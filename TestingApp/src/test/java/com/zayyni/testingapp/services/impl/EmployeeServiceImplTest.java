package com.zayyni.testingapp.services.impl;

import com.zayyni.testingapp.TestContainerConfiguration;
import com.zayyni.testingapp.dto.EmployeeDto;
import com.zayyni.testingapp.entities.Employee;
import com.zayyni.testingapp.exceptions.ResourceNotFoundException;
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

import static org.assertj.core.api.Assertions.*;
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
    void getEmployeeById_whenEmployeeIsNotPresent_thenThrowException()
    {
//        Arrange

        when(employeeRepository.findById(anyLong())).thenReturn(Optional.empty());

//        Act and Assert

        assertThatThrownBy(() -> employeeService.getEmployeeById(1L))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage("Employee with id 1 not found");

        verify(employeeRepository).findById(1L);

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

    @Test
    void testCreateNewEmployee_whenAttemptingToCreateEmployeeWithExistingEmail_thenThrowException(){

//        arrange

        when(employeeRepository.findByEmail(mockEmployeeDto.getEmail())).thenReturn(List.of(mockEmployee));

//        act and assert

        assertThatThrownBy(() -> employeeService.createNewEmployee(mockEmployeeDto))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Employee with email already exists" + mockEmployee.getEmail());

        verify(employeeRepository,only()).findByEmail(mockEmployeeDto.getEmail());
        verify(employeeRepository,never()).save(any(Employee.class));
    }


    @Test
    void testUpdateEmployee_whenEmployeeDoesNotExist_thenThrowException(){
//        arrange

        when(employeeRepository.findById(1L)).thenReturn(Optional.empty());

//        act and assert
        assertThatThrownBy(()->employeeService.updateEmployee(1L,mockEmployeeDto))
        .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage("Employee with id 1 not found");

        verify(employeeRepository,only()).findById(1L);
        verify(employeeRepository,never()).save(any(Employee.class));
    }


    @Test
    void testUpdateEmployee_whenAttemptingToUpdateEmail_thenThrowException(){

//        arrange
        when(employeeRepository.findById(mockEmployeeDto.getId())).thenReturn(Optional.of(mockEmployee));
        mockEmployeeDto.setEmail("john@example.com");
        mockEmployeeDto.setName("John");

//        act and assert

        assertThatThrownBy(()->employeeService.updateEmployee(mockEmployeeDto.getId(),mockEmployeeDto))
        .isInstanceOf(RuntimeException.class)
                .hasMessage("The email of the employee cannot be updated");

        verify(employeeRepository,only()).findById(mockEmployeeDto.getId());
        verify(employeeRepository,never()).save(any(Employee.class));

    }


    @Test
    void testUpdateEmployee_whenValidEmployee_thenUpdateEmployee(){

//        arrange
        when(employeeRepository.findById(mockEmployeeDto.getId())).thenReturn(Optional.of(mockEmployee));
        mockEmployeeDto.setEmail("john@example.com");
        mockEmployeeDto.setName("John");
        mockEmployeeDto.setSalary(25115.77);

        Employee newEmployee = modelMapper.map(mockEmployeeDto, Employee.class);
        when(employeeRepository.save(any(Employee.class))).thenReturn(newEmployee);

//        act and assert

        EmployeeDto updatedEmployeeDto = employeeService.updateEmployee(mockEmployeeDto.getId(),mockEmployeeDto);

        assertThat(updatedEmployeeDto).isEqualTo(mockEmployeeDto);
        verify(employeeRepository,only()).findById(mockEmployeeDto.getId());
        verify(employeeRepository).save(any(Employee.class));


    }


    @Test
    void testDeleteEmployee_whenEmployeeDoesNotExist_thenThrowException(){
        when(employeeRepository.existsById(1L)).thenReturn(false);

//        act and assert

        assertThatThrownBy(()->employeeService.deleteEmployee(1L))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage("Employee with id 1 not found");

        verify(employeeRepository,never()).deleteById(anyLong());

    }

    @Test
    void testDeleteEmployee_whenValidEmployee_thenDeleteEmployee(){

//        arrange

        when(employeeRepository.existsById(1L)).thenReturn(true);

//        act and assert

        assertThatCode(()->employeeService.deleteEmployee(1L))
        .doesNotThrowAnyException();
        verify(employeeRepository,only()).deleteById(1L);


    }


















}