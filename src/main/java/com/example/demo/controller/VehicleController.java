package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public Vehicle registerVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }

    @GetMapping("/vin/{vin}")
    public List<Vehicle> getVehicleByVin(@PathVariable String vin) {
        return vehicleService.getVehicleByVin(vin);
    }

    @GetMapping("/owner/{ownerId}")
    public List<Vehicle> getVehiclesByOwner(@PathVariable Long ownerId) {
        return vehicleService.getVehiclesByOwner(ownerId);
    }

    @PutMapping("/{id}/deactivate")
    public Vehicle deactivateVehicle(@PathVariable Long id) {
        return vehicleService.deactivateVehicle(id);
    }
}
