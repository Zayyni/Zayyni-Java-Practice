package com.zayyni.hospitalmanagementservice.repository;

import com.zayyni.hospitalmanagementservice.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}