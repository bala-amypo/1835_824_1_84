package com.example.demo.controller;
import org.springframework.web.bind.annonation.RestController;
import org.springframework.beans.factory.annonation.Autowired;
import com.example.demo.entity.Vehicle;
import com.example.demo.service.ServiceEntryService;
import org.springframework.web.bind.annonation.PostMapping;
import org.springframework.web.bind.annonation.RequestBody;

@RestController
public class ServiceEntry{
    @Autowired
    ServiceEntryService ses;
    @PostMapping("/ServiceEntry")
    public ServiceEntry addServiceEntry(@RequestBody ServiceEntry se){
        return ses.createServiceEntry(se);
    }
}
