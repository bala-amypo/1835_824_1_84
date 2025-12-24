package com.example.demo.service.impl;

import com.example.demo.model.ServicePart;
import com.example.demo.repository.ServicePartRepository;
import com.example.demo.service.ServicePartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePartServiceImpl {

    private final ServicePartRepository partRepo;
    private final ServiceEntryRepository entryRepo;

    public ServicePartServiceImpl(ServicePartRepository p, ServiceEntryRepository e) {
        this.partRepo = p;
        this.entryRepo = e;
    }

    public ServicePart createPart(ServicePart part) {

        entryRepo.findById(part.getServiceEntry().getId())
            .orElseThrow(() -> new EntityNotFoundException("ServiceEntry not found"));

        if (part.getQuantity() <= 0)
            throw new IllegalArgumentException("Quantity");

        return partRepo.save(part);
    }
}
