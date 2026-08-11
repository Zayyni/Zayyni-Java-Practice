package com.zayyni.springbootwebtutorial.services;

import com.zayyni.springbootwebtutorial.dto.EmployeeDto;
import com.zayyni.springbootwebtutorial.entities.EmployeeEntity;
import com.zayyni.springbootwebtutorial.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = new ModelMapper();
    }

    public Optional<EmployeeDto> getEmployeeById(Long id) {
        Optional<EmployeeEntity> employeeEntity= employeeRepository.findById(id);
        return employeeEntity.map(employee -> modelMapper.map(employee, EmployeeDto.class));
    }

    public List<EmployeeDto> getAllEmployees() {
    List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
    return employeeEntities.stream()
            .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDto.class))
            .collect(Collectors.toList());
    }

    public EmployeeDto createNewEmployee(EmployeeDto inputEmployee) {
    EmployeeEntity employeeEntity = modelMapper.map(inputEmployee, EmployeeEntity.class);
    return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDto.class);
    }


    public EmployeeDto updateEmployeeById(EmployeeDto employeeDto, Long employeeId) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDto, EmployeeEntity.class);
        employeeEntity.setId(employeeId);
        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDto.class);
    }

    public boolean isExistsByEmployeeId(Long employeeId) {
        return employeeRepository.existsById(employeeId);
    }

    public boolean deleteEmployeeById(Long employeeId) {
        boolean exist = isExistsByEmployeeId(employeeId);
        if(!exist){
            return false;
        }
       employeeRepository.deleteById(employeeId);
        return true;
    }

    public EmployeeDto updatePartialEmployeeById(
            Map<String, Object> updates,
            Long employeeId) {

        boolean exists = isExistsByEmployeeId(employeeId);

        if (!exists) {
            return null;
        }

        EmployeeEntity employeeEntity =
                employeeRepository.findById(employeeId).orElse(null);

        updates.forEach((field, value) -> {

            Field fieldToBeUpdated =
                    ReflectionUtils.findField(EmployeeEntity.class, field);

            if (fieldToBeUpdated != null) {
                ReflectionUtils.makeAccessible(fieldToBeUpdated);
                ReflectionUtils.setField(
                        fieldToBeUpdated,
                        employeeEntity,
                        value
                );
            }
        });

        EmployeeEntity savedEmployee =
                employeeRepository.save(employeeEntity);

        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }
}
