package com.example.demo.controller;

import com.example.demo.model.VerificationLog;
import com.example.demo.service.VerificationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
