package com.zayyni.cachingapp.services;

import com.zayyni.cachingapp.entities.Employee;
import com.zayyni.cachingapp.entities.SalaryAccount;
import org.springframework.stereotype.Service;

public interface SalaryAccountService {

    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
