package com.example.demo.service;
import jakarta.persistence.Service;
import com.example.demo.model.Garage;
@Service
public interface Garage{
    public Garage register(Garage garage);


    public Garage findByEmail(String email);
}