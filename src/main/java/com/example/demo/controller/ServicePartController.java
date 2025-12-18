package com.example.demo.controller;
import org.springframework.web.bind.annonation.RestController;
import org.springframework.beans.factory.annonation.Autowired;
import com.example.demo.entity.ServicePart;
import com.example.demo.service.ServicePartService;
import org.springframework.web.bind.annonation.PostMapping;
import org.springframework.web.bind.annonation.RequestBody;

@RestController
public class ServicePart{
    @Autowired
    ServicePartService sps;
    @PostMapping("/ServicePart")
    public ServicePart addServicePart(@RequestBody ServicePart sp){
        return sps.createServicePart(sp);
    }
}
