package com.zayyni.springjdbc.dao;

import com.zayyni.springjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;
@Repository("dao")
public class EmployeeDaoImpl implements IEmpoyeeDao{

    @Autowired
    private DataSource dataSource;
    @Override
    public List<Employee> getEmployeesInfo() {
        try {
            //register driver
            //connection
            Connection connection =dataSource.getConnection();
            

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
