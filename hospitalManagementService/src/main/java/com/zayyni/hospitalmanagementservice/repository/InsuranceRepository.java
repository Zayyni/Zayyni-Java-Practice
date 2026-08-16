package com.zayyni.hospitalmanagementservice.repository;

import com.zayyni.hospitalmanagementservice.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}
