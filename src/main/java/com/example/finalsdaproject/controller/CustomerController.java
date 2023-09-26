package com.example.finalsdaproject.controller;

import com.example.finalsdaproject.entity.Customer;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        // Retrieve the customers by ID from your database or service
        CustomerController customerService = null;
        Customer customer = customerService.getCustomerById(id).getBody();

        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public String getName() {
        return "Product Not Found";
    }
}
