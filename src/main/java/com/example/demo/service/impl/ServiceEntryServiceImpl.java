package com.example.demo.service.impl;

import com.example.demo.repository.ServiceEntryRepository;
import com.example.demo.model.ServiceEntry;
import com.example.demo.service.ServiceEntryService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service
public class ServiceEntryServiceImpl implements ServiceEntryService {

    @Autowired
    private ServiceEntryRepository repository;

    @Override
    public ServiceEntry createServiceEntry(ServiceEntry entry) {
        LocalDate serviceLocalDate = entry.getServiceDate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        if (serviceLocalDate.isAfter(LocalDate.now())) {
            throw new RuntimeException("Service date cannot be in the future");
        }
        return repository.save(entry);
    }

    @Override
    public ServiceEntry getServiceEntryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ServiceEntry> getEntriesForVehicle(String vehicle) {
        return repository.findAll()
                .stream()
                .filter(e -> e.getVehicle().equals(vehicle))
                .toList();
    }

    @Override
    public List<ServiceEntry> getEntriesByGarage(String garage) {
        return repository.findAll()
                .stream()
                .filter(e -> e.getGarage().equals(garage))
                .toList();
    }
}
