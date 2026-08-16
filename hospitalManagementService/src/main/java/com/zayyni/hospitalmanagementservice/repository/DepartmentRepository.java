package com.zayyni.hospitalmanagementservice.repository;

import com.zayyni.hospitalmanagementservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}