package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.ServiceEntry;
import com.example.demo.service.ServiceEntryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ServiceEntry{
    @Autowired
    ServiceEntryService ses;
    @PostMapping("/ServiceEntry")
    public ServiceEntry addServiceEntry(@RequestBody ServiceEntry se){
        return ses.createServiceEntry(se);
    }
}
