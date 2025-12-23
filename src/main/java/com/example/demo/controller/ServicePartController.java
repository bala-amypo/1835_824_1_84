package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.ServicePart;
import com.example.demo.service.ServicePartService;

import java.util.List;

@RestController
@RequestMapping("/api/service-parts")
public class ServicePartController {

    @Autowired
    private ServicePartService servicePartService;

    @PostMapping("/")
    public ServicePart addServicePart(@RequestBody ServicePart servicePart) {
        return servicePartService.createServicePart(servicePart);
    }

    @GetMapping("/{id}")
    public ServicePart getPartById(@PathVariable Long id) {
        return servicePartService.getPartById(id);
    }

    @GetMapping("/entry/{entryId}")
    public List<ServicePart> getPartsForEntry(@PathVariable Long entryId) {
        return servicePartService.getPartsForEntry(entryId);
    }
}
