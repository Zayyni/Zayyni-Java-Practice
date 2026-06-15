package com.zayyni.repo;

import com.zayyni.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {
}
