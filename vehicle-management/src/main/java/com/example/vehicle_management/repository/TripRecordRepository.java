package com.example.vehicle_management.repository;

import com.example.vehicle_management.model.TripRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRecordRepository extends JpaRepository<TripRecord, Long> {
}
