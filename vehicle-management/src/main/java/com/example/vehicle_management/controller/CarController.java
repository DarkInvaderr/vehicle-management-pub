package com.example.vehicle_management.controller;

import com.example.vehicle_management.model.Car;
import com.example.vehicle_management.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        if (car.getMileage() >= 50000) {
            car.setNeedsService(true);
        }
        if (car.getMileage() >= 300000) {
            car.setNeedsReplacement(true);
        }
        return carRepository.save(car);
    }

    @GetMapping("/service")
    public List<Car> getCarsForService() {
        return carRepository.findByMileageGreaterThanEqual(50000);
    }
}
