package com.zayyni.prodreadyfeatures.clients.impl;

import com.zayyni.prodreadyfeatures.advice.ApiResponse;
import com.zayyni.prodreadyfeatures.clients.EmployeeClient;
import com.zayyni.prodreadyfeatures.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeClientImpl implements EmployeeClient {

   private final RestClient restClient;

   Logger log = LoggerFactory.getLogger(EmployeeClientImpl.class);



    @Override
    public List<EmployeeDto> getAllEmployees() {
        log.trace("Trying to get all employees in getAllEmployees");
       try {
           ApiResponse<List<EmployeeDto>> employeeDtoList = restClient.get()
                   .uri("/employees")
                   .retrieve()
                   .onStatus(HttpStatusCode::is4xxClientError,(req,res)->{
                       log.error(new String(res.getBody().readAllBytes()));
                       throw new RuntimeException("Couldn't get all the employee");
                   })
                   .body(new ParameterizedTypeReference<>() {
                   });
           log.debug("Successfully retrieved employees in getAllEmployees");
           log.trace("Retrieved employees list in getAllEmployees {}",employeeDtoList.getData().toString());
           return employeeDtoList.getData();
       }catch (Exception e) {
           log.error("Exception occurred in getAllEmployees {}",e.getMessage());
           throw new RuntimeException(e);
       }
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        log.trace("Trying to get employees By Id in getEmployeeById with employeeId: {}", employeeId);
        try {
            ApiResponse<EmployeeDto> employeeDtoApiResponse = restClient.get()
                    .uri("employees/{employeeId}", employeeId)
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError,(req,res)->{
                        log.error(new String(res.getBody().readAllBytes()));
                        throw new RuntimeException("Couldn't get employee by id");
                    })
                    .body(new ParameterizedTypeReference<>() {
                    });
            return employeeDtoApiResponse.getData();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
        log.trace("Trying to create new employee in createNewEmployee with employeeDto: {}", employeeDto);
        try {
            ApiResponse<EmployeeDto> employeeDtoApiResponse = restClient.post()
                    .uri("employees")
                    .body(employeeDto)
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError,(req,res)->{
                        log.debug("4xx error occurred while creating new employee");
                        log.error(new String(res.getBody().readAllBytes()));
                        throw new RuntimeException("Couldn't create new employee");
                    })

                    .body(new ParameterizedTypeReference<>() {});
            log.trace("Successfully created new employee in createNewEmployee {}",employeeDto);
            return employeeDtoApiResponse.getData();

        }
        catch (Exception e) {
            log.error("Exception occurred in createNewEmployee {}",e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
