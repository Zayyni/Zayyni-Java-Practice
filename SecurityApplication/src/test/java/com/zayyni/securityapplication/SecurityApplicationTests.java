package com.zayyni.securityapplication;

import com.zayyni.securityapplication.entities.User;
import com.zayyni.securityapplication.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityApplicationTests {

    @Autowired
    private JwtService jwtService;

    @Test
    void contextLoads() {

        User user = new User(4L,"zayyni@gmail.com","1234");

        String token = jwtService.generateJwtToken(user);
        System.out.println(token);

        Long userId = jwtService.getUserIdFromToken(token);
        System.out.println(userId);

    }

}
