package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class VehicleController{
    @Autowired
    VehicleService vs;
    @PostMapping("/Vehicle")
    public Vehicle addVehicle(@RequestBody Vehicle v){
        return vs.createVehicle(v);
    }
}
