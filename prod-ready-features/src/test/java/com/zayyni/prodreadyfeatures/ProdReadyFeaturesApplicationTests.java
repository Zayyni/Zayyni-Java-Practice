package com.zayyni.prodreadyfeatures;

import com.zayyni.prodreadyfeatures.clients.EmployeeClient;
import com.zayyni.prodreadyfeatures.dto.EmployeeDto;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProdReadyFeaturesApplicationTests {

    @Autowired
    private EmployeeClient employeeClient;

    @Test
    @Order(3)
    void getAllEmployees() {
        List<EmployeeDto> employeeDtoList = employeeClient.getAllEmployees();
        System.out.println(employeeDtoList);
    }

    @Test
    @Order(2)
    void getEmployeeById() {
        EmployeeDto employeeDto = employeeClient.getEmployeeById(1L);
        System.out.println(employeeDto);
    }

    @Test
    @Order(1)
    void createNewEmployee() {
        EmployeeDto employeeDto = new EmployeeDto(
                null,
                "zayyni",
                "zayyni@gmail.com",
                2,
                "USER",
                3333.00,
                LocalDate.of(2020,1,1),
                true

        );
        EmployeeDto savedEmployeeDto = employeeClient.createNewEmployee(employeeDto);
        System.out.println(savedEmployeeDto);

    }

}
