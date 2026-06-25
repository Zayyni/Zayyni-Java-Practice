package com.zayyni.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String  vaccineName;
    private String  vaccineCompany;
    private Double  vaccineCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCompany() {
        return vaccineCompany;
    }

    public void setVaccineCompany(String vaccineCompany) {
        this.vaccineCompany = vaccineCompany;
    }

    public Double getVaccineCost() {
        return vaccineCost;
    }

    public void setVaccineCost(Double vaccineCost) {
        this.vaccineCost = vaccineCost;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", vaccineName='" + vaccineName + '\'' +
                ", vaccineCompany='" + vaccineCompany + '\'' +
                ", vaccineCost=" + vaccineCost +
                '}';
    }
}
