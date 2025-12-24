package com.example.demo.service.impl;

import com.example.demo.model.ServicePart;
import com.example.demo.repository.ServicePartRepository;
import com.example.demo.service.ServicePartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePartServiceImpl implements ServicePartService {

    @Autowired
    private ServicePartRepository servicePartRepository;

    @Override
    public ServicePart createServicePart(ServicePart servicePart) {
        if (servicePart.getQuantity() <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        return servicePartRepository.save(servicePart);
    }

    @Override
    public ServicePart getPartById(Long id) {
        Optional<ServicePart> optionalPart = servicePartRepository.findById(id);
        return optionalPart.orElse(null);
    }

    @Override
    public List<ServicePart> getPartsForEntry(String serviceEntry) {
        return servicePartRepository.findByEntryId(serviceEntry);
    }
}
