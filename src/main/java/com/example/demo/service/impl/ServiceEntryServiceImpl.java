package com.example.demo.service.impl;
import com.example.demo.repository.ServiceEntryRepository;
import com.example.demo.entity.ServiceEntry;
import com.example.demo.service.ServiceEntryService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ServiceEntryServiceImpl implements ServiceEntryService{

@Autowired
ServiceEntryRepository ser;
public ServiceEntry createServiceEntry(ServiceEntry sen){

    return ser.save(sen);
}


}