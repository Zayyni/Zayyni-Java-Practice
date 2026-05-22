package com.zayyni.springjdbc2;

import com.zayyni.springjdbc2.dao.EmployeeDao;
import com.zayyni.springjdbc2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcRunner implements CommandLineRunner {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void run(String... args) throws Exception {
        employeeDao.input(new Employee(2,"Xia","LHR"));
    }
}
