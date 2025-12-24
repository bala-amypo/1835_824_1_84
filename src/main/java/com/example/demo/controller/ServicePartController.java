package com.example.demo.controller;

import com.example.demo.model.ServicePart;
import com.example.demo.service.ServicePartService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/service-parts")
public class ServicePartController {

    private final ServicePartService servicePartService;

    public ServicePartController(ServicePartService servicePartService) {
        this.servicePartService = servicePartService;
    }

    @PostMapping
    public ServicePart addServicePart(@RequestBody ServicePart servicePart) {
        return servicePartService.createPart(servicePart);
    }

    @GetMapping("/{id}")
    public ServicePart getPartById(@PathVariable("id") Long id) {
        return servicePartService.getPartById(id);
    }

    @GetMapping("/entry/{entryId}")
    public List<ServicePart> getPartsForEntry(
            @PathVariable("entryId") Long entryId) {

        return servicePartService.getPartsForEntry(entryId);
    }
}
