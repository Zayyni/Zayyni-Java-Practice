package com.zayyni.service;

import com.zayyni.entity.Vaccine;

import java.util.List;

public interface IVaccineService {

    public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties);

    public List<Vaccine> fetchDetailsByPagination(int pageNumber, int pageSize, boolean status, String... properties);

    public void fetchDetailsByPagination (int pageSize);

}
