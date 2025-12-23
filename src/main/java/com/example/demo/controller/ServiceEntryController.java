package com.example.demo.controller;

import com.example.demo.model.ServiceEntry;
import com.example.demo.service.ServiceEntryService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/service-entries")
public class ServiceEntryController {

    @Autowired
    private ServiceEntryService serviceEntryService;

    @PostMapping("/")
    public ServiceEntry addServiceEntry(@RequestBody ServiceEntry entry) {
        return serviceEntryService.createServiceEntry(entry);
    }

    @GetMapping("/{id}")
    public ServiceEntry getServiceEntryById(@PathVariable Long id) {
        return serviceEntryService.getServiceEntryById(id);
    }

    @GetMapping("/vehicle/{vehicle}")
    public List<ServiceEntry> getEntriesForVehicle(@PathVariable String vehicle) {
        return serviceEntryService.getEntriesForVehicle(vehicle);
    }

    @GetMapping("/garage/{garage}")
    public List<ServiceEntry> getEntriesByGarage(@PathVariable String garage) {
        return serviceEntryService.getEntriesByGarage(garage);
    }
}
