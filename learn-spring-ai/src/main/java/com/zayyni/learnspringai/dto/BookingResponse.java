package com.zayyni.learnspringai.dto;


import com.zayyni.learnspringai.entity.BookingStatus;

import java.time.Instant;

public record BookingResponse(Long id, String destination, Instant departureTime, BookingStatus bookingStatus) {

}
