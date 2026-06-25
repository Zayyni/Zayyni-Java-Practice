package com.zayyni.service;

import com.zayyni.entity.Vaccine;
import com.zayyni.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService {

    @Autowired
    private IVaccineRepo vaccineRepo;

    @Override
    public String toString() {
        return "VaccineService{" +
                "vaccineRepo=" + vaccineRepo +
                '}';
    }

    public void setVaccineRepo(IVaccineRepo vaccineRepo) {
        this.vaccineRepo = vaccineRepo;
    }

    @Override
    public Vaccine searchVaccineById(Integer id) {
        return vaccineRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Vaccine not found"));
    }

    @Override
    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vaccine,
                                                  Boolean status,
                                                  String... params) {

        Example<Vaccine> example = Example.of(vaccine);

        Sort sort = Sort.by(
                status ? Sort.Direction.ASC : Sort.Direction.DESC,
                params
        );

        return vaccineRepo.findAll(example, sort);
    }

    @Override
    public String removeVaccineInfoByIds(Iterable<Integer> ids) {
        List<Vaccine> list = vaccineRepo.findAllById(ids);
        if (list.size() != 0) {
            vaccineRepo.deleteAllByIdInBatch(ids);
            return "Vaccines deleted";
        }
        return "Vaccine not found";
    }


}
