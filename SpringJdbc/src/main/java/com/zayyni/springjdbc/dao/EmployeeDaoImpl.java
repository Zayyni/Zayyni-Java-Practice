package com.zayyni.springjdbc.dao;

import com.zayyni.springjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Repository("dao")
public class EmployeeDaoImpl implements IEmpoyeeDao{

    @Autowired
    private DataSource dataSource;
    private String SQL_QUERY = "select * from employees";

    List<Employee> employees= null;
    @Override
    public List<Employee> getEmployeesInfo() {
        try {
            //register driver
            //connection
            Connection connection =dataSource.getConnection();
            PreparedStatement pstmnt = connection.prepareStatement(SQL_QUERY);
            ResultSet resultSet =pstmnt.executeQuery();
            employees = new ArrayList<>();

            while(resultSet.next()){
                Employee employee = new Employee();
//                Integer i = resultSet.getInt(1);
//                employee.setId(i);
//
//                employee.setName(resultSet.getString(2));
//
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setCity(resultSet.getString(3));
                employees.add(employee);
            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}
