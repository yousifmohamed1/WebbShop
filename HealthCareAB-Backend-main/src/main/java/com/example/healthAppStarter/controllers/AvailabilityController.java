package com.example.healthAppStarter.controllers;

import com.example.healthAppStarter.models.Availability;
import com.example.healthAppStarter.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/availabilities")
public class AvailabilityController {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    @GetMapping
    public ResponseEntity<List<Availability>> getAllAvailabilities() {
        return ResponseEntity.ok(availabilityRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Availability> getAvailabilityById(@PathVariable String id) {
        Availability availability = availabilityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Availability not found with id " + id));
        return ResponseEntity.ok(availability);
    }

    @PostMapping
    public ResponseEntity<Availability> createAvailability(@RequestBody Availability availability) {
        Availability savedAvailability = availabilityRepository.save(availability);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAvailability);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Availability> updateAvailability(@PathVariable String id, @RequestBody Availability availabilityDetails) {
        Availability availability = availabilityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Availability not found with id " + id));
        availability.setAdmin_id(availabilityDetails.getAdmin_id());
        availability.setStartDate(availabilityDetails.getStartDate());
        availability.setEndDate(availabilityDetails.getEndDate());
        final Availability updatedAvailability = availabilityRepository.save(availability);
        return ResponseEntity.ok(updatedAvailability);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAvailability(@PathVariable String id) {
        Availability availability = availabilityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Availability not found with id " + id));
        availabilityRepository.delete(availability);
        return ResponseEntity.ok().build();
    }
}
