package com.zayyni.service;

import com.zayyni.entity.Vaccine;

import java.util.Optional;

public interface IVaccineService {

    public String registerVaccineInfo(Vaccine vaccine);

    public Iterable<Vaccine> registerMultipleVaccineInfo( Iterable<Vaccine> vaccine);

    public Long vaccineCount();

    public boolean checkVaccineAvailability(Integer vaccineId);

    public Iterable<Vaccine> getVaccineList();

    public Iterable<Vaccine> getAllVaccineList(Iterable<Integer>ids);

    public Optional<Vaccine> getVaccineById(Integer id);
}
