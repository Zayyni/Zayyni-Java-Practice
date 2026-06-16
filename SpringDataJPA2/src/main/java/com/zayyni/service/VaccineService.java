package com.zayyni.service;

import com.zayyni.entity.Vaccine;
import com.zayyni.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VaccineService implements IVaccineService {


    private IVaccineRepo iVaccineRepo;

    @Autowired
    public void setiVaccineRepo(IVaccineRepo iVaccineRepo) {
        this.iVaccineRepo = iVaccineRepo;
    }

    @Override
    public String registerVaccineInfo(Vaccine vaccine) {
        Vaccine vaccine1=iVaccineRepo.save(vaccine);
        return "Vaccine Info Registered Successfully with ID: " + vaccine1.getId();
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccine) {
        return iVaccineRepo.saveAll(vaccine);
    }

    @Override
    public Long vaccineCount() {
        return iVaccineRepo.count();
    }

    @Override
    public boolean checkVaccineAvailability(Integer vaccineId) {
        return iVaccineRepo.existsById(vaccineId);
    }

    public Iterable<Vaccine> getVaccineList() {
        return iVaccineRepo.findAll();
    }

    @Override
    public Iterable<Vaccine> getAllVaccineList(Iterable<Integer> ids) {
        return iVaccineRepo.findAllById(ids);
    }

    @Override
    public Optional<Vaccine> getVaccineById(Integer id) {
        return iVaccineRepo.findById(id);
    }

    @Override
    public String deleteVaccineById(Integer id) {
        Optional<Vaccine> optional=iVaccineRepo.findById(id);
        if (optional.isPresent()) {
            iVaccineRepo.deleteById(id);
            return "Vaccine Deleted Successfully with ID: " + id;
        }
        return "Vaccine Not Found";

//        Boolean status=iVaccineRepo.existsById(id);
//        if (status) {
//            iVaccineRepo.deleteById(id);
//            return "Vaccine Deleted Successfully with ID: " + id;
//        }
//        return "Vaccine Not Found";


    }
}
