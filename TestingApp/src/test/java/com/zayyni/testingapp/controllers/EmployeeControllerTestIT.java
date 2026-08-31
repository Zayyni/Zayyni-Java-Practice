package com.zayyni.testingapp.controllers;

import com.zayyni.testingapp.TestContainerConfiguration;
import com.zayyni.testingapp.dto.EmployeeDto;
import com.zayyni.testingapp.entities.Employee;
import com.zayyni.testingapp.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTestIT extends AbstractIntegrationTest {


    @Autowired
    private EmployeeRepository employeeRepository;

    private Employee testEmployee;

    private EmployeeDto testEmployeeDto;

    @BeforeEach
    void setUp() {
        testEmployee = Employee.builder()
                .id(1L)
                .name("John")
                .email("john@example.com")
                .salary(25115.77)
                .build();

        testEmployeeDto = EmployeeDto.builder()
                .id(1L)
                .name("John")
                .email("john@example.com")
                .salary(25115.77)
                .build();

        employeeRepository.deleteAll();
    }

    @Test
    void testGetEmployeeById_success() {
        Employee savedEmployee = employeeRepository.save(testEmployee);
        webTestClient.get()
                .uri("/employees/{id}", savedEmployee.getId())
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.id").isEqualTo(savedEmployee.getId())
                .jsonPath("$.name").isEqualTo(savedEmployee.getName())
                .jsonPath("$.email").isEqualTo(savedEmployee.getEmail());
//                .returnResult().getResponseBody();
//                .value(employee -> assertEquals(savedEmployee.getId(), employee.getId()));


    }


    @Test
    void testGetEmployeeById_failure() {
        webTestClient.get()
                .uri("/employees/{id}", testEmployee.getId())
                .exchange()
                .expectStatus().isNotFound();
    }

    @Test
    void testCreateNewEmployee_whenEmployeeAlreadyExists_thenThrowException() {
        Employee savedEmployee = employeeRepository.save(testEmployee);


        webTestClient.post()
                .uri("/employees")
                .bodyValue(testEmployeeDto)
                .exchange()
                .expectStatus().is5xxServerError();

    }


    @Test
    void testCreateNewEmployee_whenEmployeeDoesNotExist_thenCreateNewEmployee() {
        Employee savedEmployee = employeeRepository.save(testEmployee);
        webTestClient.post()
                .uri("/employees")
                .bodyValue(testEmployeeDto)
                .exchange()
                .expectStatus().isCreated()
                .expectBody()
                .jsonPath("$.email").isEqualTo(testEmployeeDto.getEmail())
                .jsonPath("$.salary").isEqualTo(testEmployeeDto.getSalary())
                .jsonPath("$.name").isEqualTo(testEmployeeDto.getName());
    }


    @Test
    void testUpdateEmployee_whenEmployeeDoesNotExists_thenThrowException() {
        webTestClient.put()
                .uri("/employees/{id}", testEmployee.getId())
                .bodyValue(testEmployeeDto)
                .exchange()
                .expectStatus().isNotFound();

    }

    @Test
    void testUpdateEmployee_whenAttemptingToUpdateEmail_thenThrowException() {

        Employee savedEmployee = employeeRepository.save(testEmployee);
        testEmployeeDto.setEmail("random@example.com");
        testEmployeeDto.setName("Random Name");
        webTestClient.put()
                .uri("/employees/{id}", savedEmployee.getId())
                .bodyValue(testEmployeeDto)
                .exchange()
                .expectStatus().is5xxServerError();
    }


    @Test
    void testUpdateEmployee_whenEmployeeIsValid_thenUpdateEmployee() {
        Employee savedEmployee = employeeRepository.save(testEmployee);
        testEmployeeDto.setName("John");
        testEmployeeDto.setSalary(25000L);
        webTestClient.put()
                .uri("/employees/{id}", savedEmployee.getId())
                .bodyValue(testEmployeeDto)
                .exchange()
                .expectStatus().isOk()
                .expectBody(EmployeeDto.class)
                .isEqualTo(testEmployeeDto);


    }

    @Test
    void testDeleteEmployee_whenEmployeeDoesNotExist_thenThrowException() {
        Employee savedEmployee = employeeRepository.save(testEmployee);
        webTestClient.delete()
                .uri("/employees/{id}", savedEmployee.getId())
                .exchange()
                .expectStatus().isNotFound();
    }

    @Test
    void testDeleteEmployee_whenEmployeeIsValid_thenDeleteEmployee() {
        Employee savedEmployee = employeeRepository.save(testEmployee);
        webTestClient.delete()
                .uri("/employees/{id}", savedEmployee.getId())
                .exchange()
                .expectStatus().isNoContent()
                .expectBody(Void.class);

        webTestClient.delete()
                .uri("/employees/{id}", savedEmployee.getId())
                .exchange()
                .expectStatus().isNotFound();
    }



}