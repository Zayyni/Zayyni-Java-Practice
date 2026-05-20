package com.zayyni.springboot1.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Zayyni
{
    static {
        System.out.println("Static block of Zayyni Bean");
    }

    {
        System.out.println("Java Instance block of Zayyni Bean");
    }

    public Zayyni()
    {
        System.out.println("Constructor of Zayyni Bean");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Init method of Zayyni Class");
    }

    public void display()
    {
        System.out.println("Display of Zayyni Class");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroy method of Zayyni Class");
    }


}
