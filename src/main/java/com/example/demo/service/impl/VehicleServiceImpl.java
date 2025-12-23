package com.example.demo.service.impl;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService{

@Autowired
VehicleRepository vri;
public Vehicle createVehicle(Vehicle v){

    return vri.save(v);
}
public Vehicle getVehicleById(Long id){
    return vri.findById(id).orElse(null);
}

public  List<Vehicle> getVehiclesByOwner(String vin){
    return vr.findByOwner(vin);
}
}