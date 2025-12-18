package com.example.demo.controller;
import org.springframework.web.bind.annonation.RestController;
import org.springframework.beans.factory.annonation.Autowired;
import com.example.demo.entity.VerificationLog;
import com.example.demo.service.VerificationLogService;
import org.springframework.web.bind.annonation.PostMapping;
import org.springframework.web.bind.annonation.RequestBody;

@RestController
public class VerificationLog{
    @Autowired
    VerificationLogService vls;
    @PostMapping("/VerificationLog")
    public VerificationLog addVerificationLog(@RequestBody ServiceEntry se){
        return ses.createServiceEntry(se);
    }
}
