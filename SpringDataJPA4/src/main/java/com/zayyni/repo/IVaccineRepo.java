package com.zayyni.repo;

import com.zayyni.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
}
