package com.zayyni.hospitalmanagementservice.repository;

import com.zayyni.hospitalmanagementservice.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}