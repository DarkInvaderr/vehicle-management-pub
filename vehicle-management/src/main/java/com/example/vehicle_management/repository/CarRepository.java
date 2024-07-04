package com.example.vehicle_management.repository;

import com.example.vehicle_management.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByMileageGreaterThanEqual(int mileage);
}

