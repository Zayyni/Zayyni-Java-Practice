package com.zayyni.cachingapp.services.impl;

import com.zayyni.cachingapp.entities.Employee;
import com.zayyni.cachingapp.entities.SalaryAccount;
import com.zayyni.cachingapp.repositories.SalaryAccountRepository;
import com.zayyni.cachingapp.services.SalaryAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class SalaryAccountServiceImpl implements SalaryAccountService {


    private final SalaryAccountRepository salaryAccountRepository;
    @Override
    public void createAccount(Employee employee) {
//        if (employee.getName().equals("Zayyni")) throw new RuntimeException("Zayyni is not Allowed");

        SalaryAccount salaryAccount = SalaryAccount.builder()
                .employee(employee)
                .balance(BigDecimal.ZERO)
                .build();


        salaryAccountRepository.save(salaryAccount);
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public SalaryAccount incrementBalance(Long accountId) {
        SalaryAccount salaryAccount = salaryAccountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Salary account not found"));
        salaryAccount.setBalance(salaryAccount.getBalance().add(BigDecimal.ONE));
        salaryAccountRepository.save(salaryAccount);
        return salaryAccount;

    }

}
