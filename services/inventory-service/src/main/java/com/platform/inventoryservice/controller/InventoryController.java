package com.platform.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class InventoryController {

    @GetMapping("/inventory")
    public List<Map<String, Object>> getInventory() {
        return List.of(
                Map.of("item", "Laptop", "stock", 12),
                Map.of("item", "Phone", "stock", 30)
        );
    }
}
