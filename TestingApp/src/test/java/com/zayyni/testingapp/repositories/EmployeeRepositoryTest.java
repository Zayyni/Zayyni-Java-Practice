package com.zayyni.testingapp.repositories;

import com.zayyni.testingapp.TestContainerConfiguration;
import com.zayyni.testingapp.entities.Employee;
import com.zayyni.testingapp.services.EmployeeService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@Import(TestContainerConfiguration.class)
@ExtendWith(MockitoExtension.class)
class EmployeeRepositoryTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
        employee.setEmail("zayyni@gmail.com");
        employee.setName("zayyni");
        employee.setSalary(50000);
    }

    @Test
    void testFindByEmail_whenEmailIsPresent_thenReturnEmployee() {
//         Arrange, Given

        employeeRepository.save(employee);
//        Act, When

        List<Employee> employeeList = employeeRepository.findByEmail(employee.getEmail());

//        Assert,
        Assertions.assertThat(employeeList).isNotEmpty();
        assertThat(employeeList.size()).isEqualTo(1);
        assertThat(employeeList.get(0).getEmail()).isEqualTo(employee.getEmail());

    }

    @Test
    void testFindByEmail_whenEmailIsNotFound_thenReturnEmptyEmployeeList() {

//        Given
        String email = "notfound@gmail.com";
//        When
        List<Employee> employeeList = employeeRepository.findByEmail(email);
//        Then
        Assertions.assertThat(employeeList).isNotNull();
        Assertions.assertThat(employeeList).isEmpty();


    }
}