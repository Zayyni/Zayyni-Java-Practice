package com.zayyni.hospitalmanagementservice.repository;

import com.zayyni.hospitalmanagementservice.dto.BloodGroupStats;
import com.zayyni.hospitalmanagementservice.dto.CPatientInfo;
import com.zayyni.hospitalmanagementservice.dto.IPatientInfo;
import com.zayyni.hospitalmanagementservice.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("select p.id as id, p.name as name, p.email as email from Patient p")
    List<IPatientInfo> getAllPatientsInfo();


    @Query("""
    SELECT new com.zayyni.hospitalmanagementservice.dto.CPatientInfo(
        p.id,
        p.name,
        p.email
    )
    FROM Patient p
""")
    List<CPatientInfo> getAllPatientsInfoConcrete();


    @Query("select new com.zayyni.hospitalmanagementservice.dto.BloodGroupStats(p.bloodGroup," +"COUNT(p)) " +
            "from Patient p group by p.bloodGroup order by COUNT(p)")
    List<BloodGroupStats> getBloodGroupStats();

    @Transactional
    @Modifying
    @Query("UPDATE Patient p set p.name = :name where p.id= :id")
    int updatePatientNameWithId(@Param("name") String name, @Param("id") Long id);

}
