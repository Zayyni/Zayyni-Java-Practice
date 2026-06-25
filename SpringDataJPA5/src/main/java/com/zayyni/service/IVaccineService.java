package com.zayyni.service;

import com.zayyni.view.ResultView;

import java.util.List;

public interface IVaccineService {

    public List<ResultView> fetchByCost (Double cost);
}
