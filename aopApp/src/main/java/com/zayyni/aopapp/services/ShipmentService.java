package com.zayyni.aopapp.services;

public interface ShipmentService {

    String orderPackage(Long orderId);
    String trackPackage(Long orderId);
}
