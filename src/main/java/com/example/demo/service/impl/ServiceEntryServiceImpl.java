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
public class ServiceEntryServiceImpl {

    private final ServiceEntryRepository entryRepo;
    private final VehicleRepository vehicleRepo;
    private final GarageRepository garageRepo;

    public ServiceEntryServiceImpl(
        ServiceEntryRepository e, VehicleRepository v, GarageRepository g) {
        this.entryRepo = e;
        this.vehicleRepo = v;
        this.garageRepo = g;
    }

    public ServiceEntry createServiceEntry(ServiceEntry entry) {

        Vehicle v = vehicleRepo.findById(entry.getVehicle().getId())
            .orElseThrow(() -> new EntityNotFoundException("Vehicle not found"));

        if (!v.getActive())
            throw new IllegalArgumentException("active vehicles");

        Garage g = garageRepo.findById(entry.getGarage().getId())
            .orElseThrow(() -> new EntityNotFoundException("Garage not found"));

        if (entry.getServiceDate().isAfter(LocalDate.now()))
            throw new IllegalArgumentException("future");

        entryRepo.findTopByVehicleOrderByOdometerReadingDesc(v)
            .ifPresent(last -> {
                if (entry.getOdometerReading() < last.getOdometerReading())
                    throw new IllegalArgumentException(">=");
            });

        return entryRepo.save(entry);
    }

    public List<ServiceEntry> getEntriesForVehicle(Long vehicleId) {
        return entryRepo.findByVehicleId(vehicleId);
    }
}
