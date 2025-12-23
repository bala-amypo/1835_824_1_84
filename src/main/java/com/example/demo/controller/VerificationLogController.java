package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.VerificationLog;
import com.example.demo.service.VerificationLogService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
@RequestMapping("/api/verification-logs")
public class VerificationLogController {

    @Autowired
    private VerificationLogService service;

    @PostMapping
    public VerificationLog createLog(@RequestBody VerificationLog log) {
        return service.createLog(log);
    }

    @GetMapping("/{id}")
    public VerificationLog getLogById(@PathVariable Long id) {
        return service.getLogById(id);
    }

    @GetMapping("/entry/{entryId}")
    public List<VerificationLog> getLogsForEntry(@PathVariable Long entryId) {
        return service.getLogsForEntry(entryId);
    }
}
