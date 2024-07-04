package com.example.vehicle_management.controller;

import com.example.vehicle_management.model.TripRecord;
import com.example.vehicle_management.repository.TripRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trip_records")
public class TripRecordController {

    @Autowired
    private TripRecordRepository tripRecordRepository;

    @GetMapping
    public List<TripRecord> getAllTripRecords() {
        return tripRecordRepository.findAll();
    }

    @PostMapping
    public TripRecord createTripRecord(@RequestBody TripRecord tripRecord) {
        return tripRecordRepository.save(tripRecord);
    }
}
