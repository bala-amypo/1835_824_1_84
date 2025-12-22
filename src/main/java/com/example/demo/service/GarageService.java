package com.example.demo.service;
import com.example.demo.model.Garage;
import java.util.List;

public interface GarageService
{
    Garage createGarage(Garage ga);
   List<Garage> updateGarage(Long id,Garage garage);

}