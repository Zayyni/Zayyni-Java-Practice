package com.zayyni.service;

import com.zayyni.entity.Vaccine;

import java.util.List;

public interface IVaccineService {

    public Vaccine searchVaccineById(Integer id);

    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vaccine, Boolean status, String... params);

    public String removeVaccineInfoByIds(Iterable<Integer> ids);

}
