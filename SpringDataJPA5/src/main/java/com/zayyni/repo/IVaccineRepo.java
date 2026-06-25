package com.zayyni.repo;

import com.zayyni.entity.Vaccine;
import com.zayyni.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

    //findBy-->propertyName-->keywords
    List<ResultView> findByVaccineCostLessThan(Double cost);
}
