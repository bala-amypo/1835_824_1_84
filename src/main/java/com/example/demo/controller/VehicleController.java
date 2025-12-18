package com.example.demo.controller;
import org.springframework.web.bind.annonation.RestController;
import org.springframework.beans.factory.annonation.Autowired;
import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.web.bind.annonation.PostMapping;
import org.springframework.web.bind.annonation.RequestBody;

@RestController
public class Vehicle{
    @Autowired
    VehicleService vs;
    @PostMapping("/Vehicle")
    public Vehicle addVehicle(@RequestBody Vehicle v){
        return vs.createVehicle(v);
    }
}
