package com.example.demo.controller;
import org.springframework.web.bind.annonation.RestController;
import org.springframework.beans.factory.annonation.Autowired;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annonation.PostMapping;
import org.springframework.web.bind.annonation.RequestBody;

@RestController
public class User{
    @Autowired
    User u;
    @PostMapping("/UserProfile")
    public Garage addGarage(@RequestBody Garage ga){
        return gs.createGarage(ga);
    }
}
