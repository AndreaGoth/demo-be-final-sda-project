package com.example.finalsdaproject.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer orders")
public class CustomerOrderController {

    @GetMapping("/{id}")
    public ResponseEntity<CustomerOrderController> getProductById(@PathVariable Long id) {
        // Retrieve the customerOrder by ID from your database or service
        CustomerOrderController customerOrderControllerService = null;
        CustomerOrderController customerOrder = customerOrderControllerService.getProductById(id).getBody();

        if (customerOrder != null) {
            return ResponseEntity.ok(customerOrder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public String getName() {
        return "Customer Order Not Found";
    }
}