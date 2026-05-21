package com.zayyni.springjdbc.dao;

import com.zayyni.springjdbc.model.Employee;

import java.util.List;

public interface IEmpoyeeDao {

    List<Employee> getEmployeesInfo();
}
