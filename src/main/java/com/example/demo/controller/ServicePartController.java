package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.ServicePart;
import com.example.demo.service.ServicePartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ServicePart{
    @Autowired
    ServicePartService sps;
    @PostMapping("/ServicePart")
    public ServicePart addServicePart(@RequestBody ServicePart sp){
        return sps.createServicePart(sp);
    }
}
