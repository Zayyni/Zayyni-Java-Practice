package com.zayyni.springjdbc.dao;

import com.zayyni.springjdbc.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("dao")
public class EmployeeDaoImpl implements IEmpoyeeDao{

    @Override
    public List<Employee> getEmployeesInfo() {
        try {
            //register driver
            //connection
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
