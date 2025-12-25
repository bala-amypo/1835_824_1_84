package com.example.demo.service.impl;

import com.example.demo.model.VerificationLog;
import com.example.demo.repository.VerificationLogRepository;
import com.example.demo.service.VerificationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerificationLogServiceImpl
        implements VerificationLogService {

    @Autowired
    private VerificationLogRepository repository;

    @Override
    public VerificationLog createLog(VerificationLog log) {
        return repository.save(log);
    }

    @Override
    public List<VerificationLog> getLogsForEntry(Long serviceEntryId) {
        return repository.findByServiceEntryId(serviceEntryId);
    }
}
