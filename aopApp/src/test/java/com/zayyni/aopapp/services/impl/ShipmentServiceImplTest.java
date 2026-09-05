package com.zayyni.aopapp.services.impl;

import com.zayyni.aopapp.services.ShipmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShipmentServiceImplTest {

    @Autowired
    private ShipmentService shipmentService;

    @Test
    void aopTestOrderPackage() {
        shipmentService.orderPackage(1L);
    }

    @Test
    void aopTestTrackPackage() {
        shipmentService.trackPackage(1L);
    }

}