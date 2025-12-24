package com.example.demo.service.impl;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicle> getVehicleByVin(String vin) {
        return vehicleRepository.findByVin(vin); // Must return List<Vehicle>
    }

    @Override
    public List<Vehicle> getVehiclesByOwner(Long ownerId) {
        return vehicleRepository.findByOwnerId(ownerId); // Must return List<Vehicle>
    }

    @Override
    public Vehicle deactivateVehicle(Long id) {
        Vehicle vehicle = vehicleRepository.findById(id).orElse(null);
        if (vehicle != null) {
            vehicle.setActive(false); // Assuming Vehicle has 'active' boolean field
            vehicleRepository.save(vehicle);
        }
        return vehicle;
    }
}
