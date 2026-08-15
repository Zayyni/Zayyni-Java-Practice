package com.zayyni.hospitalmanagementservice;

import com.zayyni.hospitalmanagementservice.dto.BloodGroupStats;
import com.zayyni.hospitalmanagementservice.dto.CPatientInfo;
import com.zayyni.hospitalmanagementservice.dto.IPatientInfo;
import com.zayyni.hospitalmanagementservice.entity.Patient;
import com.zayyni.hospitalmanagementservice.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient()
    {
//        List<Patient> patients = patientRepository.findAll();
//        List<CPatientInfo> patients = patientRepository.getAllPatientsInfoConcrete();
//        List<BloodGroupStats> patients = patientRepository.getBloodGroupStats();
//
//
//        for (BloodGroupStats patient : patients)
//        {
//            System.out.println(patient);
//        }

        int rowsAffected = patientRepository.updatePatientNameWithId("Zayyni", 1L);
        System.out.println(rowsAffected);
    }
}
