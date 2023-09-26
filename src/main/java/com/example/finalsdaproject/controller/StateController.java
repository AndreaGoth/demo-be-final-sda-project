package com.example.finalsdaproject.controller;

import com.example.finalsdaproject.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Lazy
@RestController
@RequestMapping("/states")
public class StateController {

    private final StateController stateService;
    @Autowired public StateController(StateController stateService) {
        this.stateService = stateService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<State> getStateById() {
        // Retrieve the product by ID from your database or service
        State state = stateService.getStateById().getBody();

        if (state != null) {
            return ResponseEntity.ok(state);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public String getName() {
        return "State Not Found";
    }
}
