package com.zayyni.repo;

import com.zayyni.entity.Vaccine;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine,Integer> {

}
