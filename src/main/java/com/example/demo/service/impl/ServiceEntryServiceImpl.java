package com.example.demo.service.impl;

import com.example.demo.model.ServiceEntry;
import com.example.demo.repository.ServiceEntryRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.ServiceEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceEntryServiceImpl implements ServiceEntryService {

    @Autowired
    private ServiceEntryRepository serviceEntryRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public ServiceEntry createServiceEntry(ServiceEntry entry) {
        return serviceEntryRepository.save(entry);
    }

    @Override
    public ServiceEntry getServiceEntryById(Long id) {
        return serviceEntryRepository.findById(id).orElse(null);
    }

    @Override
    public List<ServiceEntry> getEntriesForVehicle(Long vehicleId) {
        return serviceEntryRepository.findByVehicleId(vehicleId);
    }

    @Override
    public List<ServiceEntry> getEntriesByGarage(Long garageId) {
        return serviceEntryRepository
                .findByGarageIdAndOdometerReadingGreaterThanEqual(garageId, 0);
    }

    @Override
    public List<ServiceEntry> getEntriesByVehicleAndDateRange(
            Long vehicleId,
            LocalDate from,
            LocalDate to
    ) {
        return serviceEntryRepository
                .findByVehicleIdAndServiceDateBetween(vehicleId, from, to);
    }
}
