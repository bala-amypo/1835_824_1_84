package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Garage;
import com.example.demo.service.GarageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping
public class GarageController{
    @Autowired
    private GarageService gs;
    @PostMapping("/Garage")
    public Garage addGarage(@RequestBody Garage ga){
        return gs.createGarage(ga);
    }
    @PutMapping("/update")
    public Garage changeGarage(@RequestBody Long id,@RequestParam Garage garage){
        return gs.updateGarage(id,garage);
    }
}
