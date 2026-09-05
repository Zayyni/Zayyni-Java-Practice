package com.zayyni.learnspringai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingListResponse {

    private List<BookingResponse> bookingResponses;
    private String message;
}
