package com.zayyni.hospitalmanagementservice;

import com.zayyni.hospitalmanagementservice.entity.Appointment;
import com.zayyni.hospitalmanagementservice.entity.Insurance;
import com.zayyni.hospitalmanagementservice.service.AppointmentService;
import com.zayyni.hospitalmanagementservice.service.InsuranceService;
import com.zayyni.hospitalmanagementservice.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private PatientService patientService;

    @Test
    public void testAssignInsuranceToPatient() {
        Insurance insurance = Insurance.builder()
                .provider("JUBBLE")
                .policyNumber("JUB_223")
                .validUntil(LocalDate.of(2026,12,1))
                .build();

        var updatedInsurance = insuranceService.assignInsuranceToPatient(insurance,1L);
        System.out.println(updatedInsurance);

//        patientService.deletePatientFromInsurance(1L);

        var patient = insuranceService.removeInsuranceOfAPatient(1L);
        System.out.println(patient);
    }

    @Test
    public void testCreateAppointment() {
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026,12,1,1,1))
                .reason("test reason")
                .build();

        var updatedAppointment = appointmentService.createNewAppointment(appointment,1L,2L);
        System.out.println(updatedAppointment);

        patientService.deletePatientFromInsurance(2L);


    }
}
