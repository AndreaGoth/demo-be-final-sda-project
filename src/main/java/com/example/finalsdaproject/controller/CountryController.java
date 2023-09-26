package com.example.finalsdaproject.controller;

import com.example.finalsdaproject.entity.Country;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @GetMapping("/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable Long id) {
        // Retrieve the country by ID from your database or service
        CountryController countryService = null;
       Country country = countryService.getCountryById(id).getBody();

        if (country != null) {
            return ResponseEntity.ok(country);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public String getName() {
        return "Country Not Found";
    }
}
