package com.example.vehicle_management.model;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private int mileage;
    private boolean needsService;
    private boolean needsReplacement;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isNeedsService() {
        return needsService;
    }

    public void setNeedsService(boolean needsService) {
        this.needsService = needsService;
    }

    public boolean isNeedsReplacement() {
        return needsReplacement;
    }

    public void setNeedsReplacement(boolean needsReplacement) {
        this.needsReplacement = needsReplacement;
    }
}
