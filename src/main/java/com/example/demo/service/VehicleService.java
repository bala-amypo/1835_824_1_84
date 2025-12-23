package com.example.demo.service;
import com.example.demo.model.Vehicle;


public interface VehicleService
{
    Vehicle createVehicle(Vehicle v);
    Vehicle getVehicleById(Long id);
     Vehicle getVehiclesByOwner(String vin);
    // Vehicle getVehiclesByOwner(Long ownerId);
     //Vehicle deactivateVehicle(Long id);
}