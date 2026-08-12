package com.zayyni.springbootwebtutorial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zayyni.springbootwebtutorial.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto
{
    private Long id;
//    @NotNull(message = "Required field in Employee : name")
    @NotBlank(message = "Name field cannot be blank")
    @Size(min = 3,max = 20, message = "Name length should be in the size limit")
    private String name;
    @Email(message = "Email should be a valid email")
    private String email;
    @Max(value = 80, message = "Age cannot be greater than 80")
    @Min(value = 18, message = "Age cannot be less than 18")
    private Integer age;

    @NotBlank(message = "Role of employee cannot be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$" , message = "The role of employee can be Admin or User")
    @EmployeeRoleValidation
    private String role;

    @NotNull(message = "Salary of employee cannot be null")
    @Positive(message = "Salary of employee should be positive")
    @Digits(integer = 6,fraction = 2,message = "The salary can be in for xxxx.xx")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private Double salary;

    @PastOrPresent(message = "Date of joining field in employee cannot be in the future")
    private LocalDate dateOfJoining;
//    @AssertTrue(message = "Employee Should be active")
    @JsonProperty("isActive")
    private Boolean isActive;


}


