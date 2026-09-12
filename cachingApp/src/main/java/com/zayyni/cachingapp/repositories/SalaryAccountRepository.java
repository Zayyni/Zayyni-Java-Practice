package com.zayyni.cachingapp.repositories;

import com.zayyni.cachingapp.entities.SalaryAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryAccountRepository extends JpaRepository<SalaryAccount, Long> {
    SalaryAccount getAllById(Long id);
}