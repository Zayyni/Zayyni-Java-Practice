package com.zayyni.service;

import org.springframework.stereotype.Service;

@Service
public class Amazon {


    private IDelivery service;
    public Amazon(IDelivery service) {
        this.service = service;
        System.out.println("Amazon Bean Created");
    }

    public Boolean deliverProduct(Double amount) {
        return service.deliverTheProduct(amount);

    }
}
