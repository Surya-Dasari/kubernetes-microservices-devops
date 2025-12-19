package com.platform.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PaymentController {

    @GetMapping("/payments")
    public List<Map<String, String>> getPayments() {
        return List.of(
                Map.of("id", "901", "status", "SUCCESS"),
                Map.of("id", "902", "status", "PENDING")
        );
    }
}
