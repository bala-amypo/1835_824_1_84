package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ServicePart;

import java.util.List;

public interface ServicePartRepository extends JpaRepository<ServicePart, Long> {
    List<ServicePart> findByEntryId(Long entryId);
}
