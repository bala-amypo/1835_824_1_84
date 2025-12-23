package com.example.demo.service.impl;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class VehicleServiceImpl implements VehicleService{

@Autowired
VehicleRepository vr;
public Vehicle createVehicle(Vehicle v){

    return vr.save(v);
}
public Vehicle get

}