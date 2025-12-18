package com.example.demo.service.impl;
import com.example.demo.repository.GarageRepository;
import com.example.demo.entity.Garage;
import com.example.demo.service.GarageService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class GarageServiceImpl implements GarageService{

@Autowired
GarageRepository gr;
public Garage createGarage(Garage gar){

    return gr.save(gar);
}


}