package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.VerificationLog;
import com.example.demo.service.VerificationLogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class VerificationLog{
    @Autowired
    VerificationLogService vls;
    @PostMapping("/VerificationLog")
    public VerificationLog addVerificationLog(@RequestBody VerificationLog vl){
        return vls.createVerificationLog(vl);
    }
}
