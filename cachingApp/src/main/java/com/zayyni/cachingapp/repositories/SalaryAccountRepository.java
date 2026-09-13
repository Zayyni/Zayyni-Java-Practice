package com.zayyni.cachingapp.repositories;

import com.zayyni.cachingapp.entities.SalaryAccount;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaryAccountRepository extends JpaRepository<SalaryAccount, Long> {
    SalaryAccount getAllById(Long id);


    @Override
//    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<SalaryAccount> findById(Long id);
}