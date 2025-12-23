package com.example.demo.service.impl;

import com.example.demo.repository.GarageRepository;
import com.example.demo.model.Garage;
import com.example.demo.service.GarageService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class GarageServiceImpl implements GarageService {

    @Autowired
    private GarageRepository garageRepository;

    @Override
    public Garage createGarage(Garage garage) {
        garageRepository.findByName(garage.getName())
                .ifPresent(g -> {
                    throw new RuntimeException("Garage name already exists");
                });
        return garageRepository.save(garage);
    }

    @Override
    public Garage updateGarage(Long id, Garage garage) {
        Garage existing = getGarageById(id);
        existing.setName(garage.getName());
        existing.setLocation(garage.getLocation());
        return garageRepository.save(existing);
    }

    @Override
    public Garage getGarageById(Long id) {
        return garageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Garage not found"));
    }

    @Override
    public List<Garage> getAllGarages() {
        return garageRepository.findAll();
    }

    @Override
    public Garage deactivateGarage(Long id) {
        Garage garage = getGarageById(id);
        garage.setActive(false);
        return garageRepository.save(garage);
    }
}
