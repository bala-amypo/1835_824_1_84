package com.example.demo.service.impl;

import com.example.demo.model.Garage;
import com.example.demo.repository.GarageRepository;
import com.example.demo.service.GarageService;

public class GarageServiceImpl implements GarageService {

    private final GarageRepository garageRepository;

    // ✅ Constructor injection REQUIRED
    public GarageServiceImpl(GarageRepository garageRepository) {
        this.garageRepository = garageRepository;
    }

    @Override
    public Garage createGarage(Garage garage) {
        if (garageRepository.findByGarageName(garage.getGarageName()).isPresent()) {
            throw new IllegalArgumentException("Garage name already exists");
        }
        return garageRepository.save(garage);
    }
}
