package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/Vehicle")
public class VehicleController{
    @Autowired
   private VehicleService vs;
    @PostMapping("/add")
    public Vehicle addVehicle(@RequestBody Vehicle v){
        return vs.createVehicle(v);
    }
    @GetMapping("/{id}")
    public Vehicle getById(@PathVariable Long id){
        return vs.getVehicleById(id);
    }
    @GetMapping("/vin/{vin}")
    public  List<Vehicle> getByVin (@PathVariable String vin){
        return vs.getVehiclesByOwner(vin);
    }
}
