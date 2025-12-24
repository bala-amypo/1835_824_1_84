package com.example.demo.service.impl;

import com.example.demo.repository.GarageRepository;
import com.example.demo.model.Garage;
import com.example.demo.service.GarageService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class GarageServiceImpl {

    private final GarageRepository repo;

    public GarageServiceImpl(GarageRepository repo) {
        this.repo = repo;
    }

    public Garage createGarage(Garage g) {
        if (repo.findByGarageName(g.getGarageName()).isPresent())
            throw new IllegalArgumentException("already exists");
        return repo.save(g);
    }
}
