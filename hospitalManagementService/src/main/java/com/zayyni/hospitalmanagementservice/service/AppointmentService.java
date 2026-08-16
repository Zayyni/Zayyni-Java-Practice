package com.zayyni.hospitalmanagementservice.service;

import com.zayyni.hospitalmanagementservice.entity.Appointment;
import com.zayyni.hospitalmanagementservice.entity.Doctor;
import com.zayyni.hospitalmanagementservice.entity.Patient;
import com.zayyni.hospitalmanagementservice.repository.AppointmentRepository;
import com.zayyni.hospitalmanagementservice.repository.DoctorRepository;
import com.zayyni.hospitalmanagementservice.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;

    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId, Long patientId) {

        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);

        return appointment;
    }
}
