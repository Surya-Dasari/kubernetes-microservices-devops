package com.platform.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public List<Map<String, String>> getOrders() {
        return List.of(
                Map.of("id", "501", "item", "Laptop"),
                Map.of("id", "502", "item", "Phone")
        );
    }
}

