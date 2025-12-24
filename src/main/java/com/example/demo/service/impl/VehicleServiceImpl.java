package com.example.demo.service.impl;

import com.example.demo.repository.VehicleRepository;
import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        vehicle.setActive(true);
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Vehicle not found"));
    }

    @Override
    public List<Vehicle> getVehicleByVin(String vin) {
        return vehicleRepository.findByVin(vin);
    }

    @Override
    public List<Vehicle> getVehiclesByOwner(Long ownerId) {
        return vehicleRepository.findAll()
                .stream()
                .filter(v -> ownerId.equals(v.getOwnerId()))
                .toList();
    }

    @Override
    public Vehicle deactivateVehicle(Long id) {
        Vehicle vehicle = getVehicleById(id);
        vehicle.setActive(false);
        return vehicleRepository.save(vehicle);
    }
}
