package com.zayyni.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstLight implements IDelivery{

    public FirstLight() {
        System.out.println("First Light Bean Created");
    }
    @Override
    public Boolean deliverTheProduct(Double amount) {
        System.out.println("FirstLight delivered " + amount);
        return true;
    }
}
