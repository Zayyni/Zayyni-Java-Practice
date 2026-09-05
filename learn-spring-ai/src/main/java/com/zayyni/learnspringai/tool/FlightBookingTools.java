package com.zayyni.learnspringai.tool;

import com.zayyni.learnspringai.dto.BookingListResponse;
import com.zayyni.learnspringai.dto.BookingResponse;
import com.zayyni.learnspringai.entity.BookingStatus;
import com.zayyni.learnspringai.entity.FlightBooking;
import com.zayyni.learnspringai.service.FlightBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FlightBookingTools {

    private final FlightBookingService flightBookingService;

    @Tool(
            name = "flight_booking_tool",
            description = "Create a new flight booking for a user"
    )
    public BookingResponse creatBooking(
            @ToolParam(description = "The uniquer user id (e.g. userId is user123)")
            String userId,

            @ToolParam(description = "The destination for the flight booking (e.g. city like Lahore, Karachi, etc")
            String destination,

            @ToolParam(description = "Departure date and time in ISO-8601 format (e.g., 2026-09-25T14:33:00Z)")
            Instant departureTime) {

        var flightBooking = flightBookingService.creatBooking(userId, destination, departureTime);
        return new BookingResponse(
                flightBooking.getId(),
                flightBooking.getDestination(),
                flightBooking.getDepartureTime(),
                flightBooking.getBookingStatus());

    }

    @Tool(
            name = "get_user_bookings",
            description = "Retrieve all flight bookings for the current user, sorted by departure time (most recent first). "+
                    "Returns an empty list message if none exist"
    )
    public BookingListResponse getUserBookings(
            @ToolParam(description = "The uniquer user ID", required = true)
            String userId
    ){
        List<FlightBooking> bookings = flightBookingService.getUserBookings(userId);

        List<BookingResponse> bookingResponses = bookings.stream()
                .map(b->new BookingResponse(
                        b.getId(),
                        b.getDestination(),
                        b.getDepartureTime(),
                        b.getBookingStatus()
                ))
                .toList();

        String message = bookings.isEmpty()
                ?"You have no bookings"
                :"Here are your bookings";

        return new BookingListResponse(bookingResponses,message);
    }

    @Tool(
            name = "update_booking_status",
            description = "Update the status of an existing flight booking (e.g., cancel it). "+
                    "Only the owner of the booking can modify it. "+
                    "Common use: set status to CANCELLED."
    )
    public BookingResponse updateBookingStatus(
            @ToolParam(description = "The booking ID returned from create or getting bookings")
            Long bookingId,

            @ToolParam(description = "The user ID who owns the booking")
            String userId,

            @ToolParam(description = "New status : CONFIRMED, CANCELLED, or PENDING")
            BookingStatus bookingStatus
    ){

        FlightBooking flightBooking = flightBookingService.updateBookingStatus(bookingId,bookingStatus,userId);
        return new BookingResponse(
                flightBooking.getId(),
                flightBooking.getDestination(),
                flightBooking.getDepartureTime(),
                flightBooking.getBookingStatus()
        );
    }
}
