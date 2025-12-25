package com.example.demo.service.impl;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public List<Vehicle> getVehicleByVin(String vin) {
        return vehicleRepository.findByVin(vin);
    }

    public List<Vehicle> getVehiclesByOwner(Long ownerId) {
        return vehicleRepository.findByOwnerId(ownerId);
    }

    public Vehicle deactivateVehicle(Long id) {
        Vehicle vehicle = vehicleRepository.findById(id).orElse(null);
        if (vehicle == null) {
            return null;
        }
        vehicle.setActive(false);
        return vehicleRepository.save(vehicle);
    }
}
