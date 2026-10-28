package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Long ticketId;
    private Long orderId;
    private String passengerFullName;
    private int carriageNumber;
    private int seatNumber;
    private String qrCode;
    private String status;
}