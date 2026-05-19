package com.zayyni.springboot1;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    public Dev() {
        System.out.println("Dev constructor");
    }

    public void build(){
        System.out.println("Dev build");
    }
}
