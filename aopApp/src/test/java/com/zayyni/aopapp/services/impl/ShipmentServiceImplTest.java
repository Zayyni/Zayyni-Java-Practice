package com.zayyni.aopapp.services.impl;

import com.zayyni.aopapp.services.ShipmentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class ShipmentServiceImplTest {

    @Autowired
    private ShipmentService shipmentService;

    @Test
    void aopTestOrderPackage() {
       String orderString = shipmentService.orderPackage(1L);
       log.info("orderString: {}", orderString);
    }

    @Test
    void aopTestTrackPackage() {
        shipmentService.trackPackage(1L);
    }

}