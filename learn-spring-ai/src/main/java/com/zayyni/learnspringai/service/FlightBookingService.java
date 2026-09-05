package com.zayyni.learnspringai.service;

import com.zayyni.learnspringai.entity.BookingStatus;
import com.zayyni.learnspringai.entity.FlightBooking;
import com.zayyni.learnspringai.repository.FlightBookingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class FlightBookingService {

    private final FlightBookingRepository flightBookingRepository;

    public FlightBooking creatBooking(String userId, String destination, Instant departureTime) {
        boolean exists = flightBookingRepository.existsByUserIdAndDestinationAndDepartureTime(
                userId, destination, departureTime
        );
        if (exists) {
            throw new IllegalArgumentException("Booking already exists");
        }
        FlightBooking flightBooking = FlightBooking.builder()
                .userId(userId)
                .destination(destination)
                .departureTime(departureTime)
                .bookingStatus(BookingStatus.CONFIRMED)
                .build();

        return flightBookingRepository.save(flightBooking);
    }


    public List<FlightBooking> getUserBookings(String userId) {
        return flightBookingRepository.findByUserIdOrderByDepartureTimeDesc(userId);
    }

    public FlightBooking updateBookingStatus(Long bookingId, BookingStatus bookingStatus,String userId) {
        FlightBooking booking = flightBookingRepository.findById(bookingId).orElseThrow(
                () -> new IllegalArgumentException("Booking not found"));

        if(!booking.getUserId().equals(userId)) {
            throw new IllegalArgumentException("Booking user id mismatch");
        }
        booking.setBookingStatus(bookingStatus);
        return flightBookingRepository.save(booking);
    }



}
