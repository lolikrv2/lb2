package com.example.demo.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.example.demo.entity.Trip;

@Component
public class TicketHandler {

    public Mono<ServerResponse> getHome(ServerRequest request) {
        return ServerResponse
                .ok()
                .contentType(MediaType.valueOf("text/plain;charset=UTF-8"))
                .body(BodyInserters.fromValue("Головна сторінка системи «Залізничний Е-квиток»!"));
    }

    public Mono<ServerResponse> getTrips(ServerRequest request) {
        Flux<Trip> trips = Flux.just(
                new Trip(1L, "Київ", "Львів", "08:30", 450.0, "ACTIVE"),
                new Trip(2L, "Київ", "Одеса", "09:15", 500.0, "ACTIVE"),
                new Trip(3L, "Харків", "Львів", "11:00", 650.0, "ACTIVE")
        );

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(trips, Trip.class);
    }
}