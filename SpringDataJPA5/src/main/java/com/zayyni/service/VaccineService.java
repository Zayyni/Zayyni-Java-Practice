package com.zayyni.service;

import com.zayyni.repo.IVaccineRepo;
import com.zayyni.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService {

    private IVaccineRepo repo;

    @Autowired
    public VaccineService(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<ResultView> fetchByCost(Double cost) {
        return repo.findByVaccineCostLessThan(cost);
    }
}
