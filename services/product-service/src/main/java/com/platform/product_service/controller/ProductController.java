package com.platform.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Map<String, String>> getProducts() {
        return List.of(
                Map.of("id", "101", "name", "Laptop"),
                Map.of("id", "102", "name", "Phone")
        );
    }
}
