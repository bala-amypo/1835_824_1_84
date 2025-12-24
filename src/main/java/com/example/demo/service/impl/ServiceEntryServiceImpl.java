package com.example.demo.service.impl;

import com.example.demo.model.ServiceEntry;
import com.example.demo.model.Vehicle;
import com.example.demo.repository.ServiceEntryRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.ServiceEntryService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceEntryServiceImpl implements ServiceEntryService {

    private final ServiceEntryRepository serviceEntryRepository;
    private final VehicleRepository vehicleRepository;

    public ServiceEntryServiceImpl(
            ServiceEntryRepository serviceEntryRepository,
            VehicleRepository vehicleRepository
    ) {
        this.serviceEntryRepository = serviceEntryRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public ServiceEntry createEntry(ServiceEntry entry) {
        return serviceEntryRepository.save(entry);
    }

    @Override
    public ServiceEntry getEntryById(Long id) {
        return serviceEntryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ServiceEntry not found"));
    }

    @Override
    public ServiceEntry getLatestEntryForVehicle(Long vehicleId) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new EntityNotFoundException("Vehicle not found"));

        return serviceEntryRepository.findTopByVehicleOrderByOdometerDesc(vehicle)
                .orElse(null);
    }

    @Override
    public List<ServiceEntry> getEntriesByVehicle(Long vehicleId) {
        return serviceEntryRepository.findByVehicleId(vehicleId);
    }

    @Override
    public List<ServiceEntry> getEntriesByGarageAndMinOdometer(Long garageId, int minOdometer) {
        return serviceEntryRepository.findByGarageIdAndOdometerGreaterThanEqual(
                garageId,
                minOdometer
        );
    }

    @Override
    public List<ServiceEntry> getEntriesByVehicleAndDateRange(
            Long vehicleId,
            LocalDate startDate,
            LocalDate endDate
    ) {
        return serviceEntryRepository.findByVehicleIdAndServiceDateBetween(
                vehicleId,
                startDate,
                endDate
        );
    }
}
