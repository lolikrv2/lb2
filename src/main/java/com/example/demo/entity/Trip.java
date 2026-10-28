package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    private Long tripId;
    private String departureStation;
    private String arrivalStation;
    private String departureTime;
    private double basePrice;
    private String status;
}