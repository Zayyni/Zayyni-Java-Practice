package com.zayyni.service;

import org.springframework.stereotype.Service;

@Service
public class FedEx implements IDelivery {
    @Override
    public Boolean deliverTheProduct(Double amount) {
        System.out.println("Fed Ex delivered " + amount);
        return true;
    }
}
