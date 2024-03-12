package com.ticket.gateway.gatewayapi.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/orders/v1").uri("http://localhost:8081/"))
                .route(r -> r.path("/api/tickets/v1").uri("http://localhost:8082/"))
                .route(r -> r.path("/api/ticket-orders/v1").uri("http://localhost:8083/"))
                .build();
    }
}
