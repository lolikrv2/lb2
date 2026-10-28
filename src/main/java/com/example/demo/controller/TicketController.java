package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import com.example.demo.entity.Ticket;

@RestController
public class TicketController {

    @GetMapping("/tickets")
    public Flux<Ticket> getTickets() {
        return Flux.just(
                new Ticket(101L, 1L, "Кравчук Євген", 7, 14, "QR_HASH_12345", "PAID"),
                new Ticket(102L, 2L, "Петренко Іван", 5, 22, "QR_HASH_67890", "PAID")
        );
    }
}