package com.example.demo.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.example.demo.handler.TicketHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class TicketRouter {

    @Bean
    public RouterFunction<ServerResponse> route(TicketHandler ticketHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/").and(accept(MediaType.TEXT_PLAIN)), ticketHandler::getHome)
                .andRoute(RequestPredicates.GET("/trips").and(accept(MediaType.APPLICATION_JSON)), ticketHandler::getTrips);
    }
}