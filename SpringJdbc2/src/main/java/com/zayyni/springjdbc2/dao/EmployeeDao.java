package com.zayyni.springjdbc2.dao;

import com.zayyni.springjdbc2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String sql="insert into employee(id,name,city) values(?,?,?)";

//    public void input()
//    {
//        jdbcTemplate.update(sql);
//        System.out.println("Successfully Inserted");
//    }

    public void input(Employee employee)
    {
        jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getCity());
    }
}
