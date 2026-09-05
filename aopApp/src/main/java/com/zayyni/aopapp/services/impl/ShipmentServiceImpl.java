package com.zayyni.aopapp.services.impl;

import com.zayyni.aopapp.services.ShipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShipmentServiceImpl implements ShipmentService {


    @Override
    public String orderPackage(Long orderId) {

        try {
            log.info("processing the order package ........");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            log.error("Error occurred while processing the order package ........{}", e.getMessage());
        }
        return "Order has been placed successfully, OrderId: " + orderId;
    }

    @Override
    public String trackPackage(Long orderId) {
        try {
            log.info("processing the track package ........");
            Thread.sleep(500);
        }catch (InterruptedException e){
            log.error("Error occurred while processing the track package ........{}", e.getMessage());
        }
        return "Track has been placed successfully, OrderId: " + orderId;
    }
}
