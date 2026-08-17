package com.zayyni.prodreadyfeatures.clients.impl;

import com.zayyni.prodreadyfeatures.advice.ApiResponse;
import com.zayyni.prodreadyfeatures.clients.EmployeeClient;
import com.zayyni.prodreadyfeatures.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeClientImpl implements EmployeeClient {

   private final RestClient restClient;

    @Override
    public List<EmployeeDto> getAllEmployees() {
       try {
           ApiResponse<List<EmployeeDto>> employeeDtoList = restClient.get()
                   .uri("/employees")
                   .retrieve()
                   .body(new ParameterizedTypeReference<>() {
                   });
           return employeeDtoList.getData();
       }catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        try {
            ApiResponse<EmployeeDto> employeeDtoApiResponse = restClient.get()
                    .uri("employees/{employeeId}", employeeId)
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });
            return employeeDtoApiResponse.getData();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
        try {
            ApiResponse<EmployeeDto> employeeDtoApiResponse = restClient.post()
                    .uri("employees")
                    .body(employeeDto)
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError,(req,res)->{
                        System.out.println(new String(res.getBody().readAllBytes()));
                        throw new RuntimeException("Couldn't create new employee");
                    })

                    .body(new ParameterizedTypeReference<>() {});
            return employeeDtoApiResponse.getData();

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
