package com.zayyni.service;

import com.zayyni.entity.Vaccine;
import com.zayyni.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService {

    private IVaccineRepo vaccineRepo;

    @Autowired
    public void setVaccineRepo(IVaccineRepo vaccineRepo) {
        this.vaccineRepo = vaccineRepo;
    }


    @Override
    public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties) {
        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        return vaccineRepo.findAll(sort);
    }

    @Override
    public List<Vaccine> fetchDetailsByPagination(int pageNumber, int pageSize, boolean status, String... properties) {
        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        PageRequest pageable = PageRequest.of(pageNumber - 1, pageSize, sort);
        Page<Vaccine> page=vaccineRepo.findAll(pageable);
        return page.getContent();
    }

    @Override
    public void fetchDetailsByPagination(int pageSize) {
        long count = 4l;
        long pageCount = count/pageSize;

        pageCount= count%pageSize==0?pageCount:++pageCount;


        for (int i=0;i<pageCount;i++) {
            PageRequest pageable =PageRequest.of(i,pageSize);
            Page<Vaccine> page=vaccineRepo.findAll(pageable);
            page.getContent().forEach(System.out::println);
        }
    }
}
