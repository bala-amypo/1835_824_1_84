package com.example.demo.controller;
import org.springframework.web.bind.annonation.RestController;
import org.springframework.beans.factory.annonation.Autowired;
import com.example.demo.entity.Garage;
import com.example.demo.service.GarageService;
import org.springframework.web.bind.annonation.PostMapping;
import org.springframework.web.bind.annonation.RequestBody;

@RestController
public class Garage{
    @Autowired
    GarageService gs;
    @PostMapping("/UserProfile")
    public Garage addGarage(@RequestBody Garage ga){
        return gs.createGarage(ga);
    }
}
