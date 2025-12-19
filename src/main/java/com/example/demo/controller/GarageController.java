package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Garage;
import com.example.demo.service.GarageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Garage{
    @Autowired
    GarageService gs;
    @PostMapping("/Garage")
    public Garage addGarage(@RequestBody Garage ga){
        return gs.createGarage(ga);
    }
}
