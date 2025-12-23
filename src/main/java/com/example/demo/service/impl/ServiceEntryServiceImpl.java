package com.example.demo.service.impl;

import com.example.demo.repository.ServiceEntryRepository;
import com.example.demo.model.ServiceEntry;
import com.example.demo.service.ServiceEntryService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceEntryServiceImpl implements ServiceEntryService {

    @Autowired
    private ServiceEntryRepository repository;

    @Override
    public ServiceEntry createServiceEntry(ServiceEntry entry) {
        if (entry.getServiceDate().isAfter(LocalDate.now())) {
            throw new RuntimeException("future");
        }

        return repository.save(entry);
    }

    @Override
    public ServiceEntry getServiceEntryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ServiceEntry> getEntriesForVehicle(Long vehicleId) {
        return repository.findAll()
                .stream()
                .filter(e -> e.getVehicleId().equals(vehicleId))
                .toList();
    }

    @Override
    public List<ServiceEntry> getEntriesByGarage(Long garageId) {
        return repository.findAll()
                .stream()
                .filter(e -> e.getGarageId().equals(garageId))
                .toList();
    }
}
