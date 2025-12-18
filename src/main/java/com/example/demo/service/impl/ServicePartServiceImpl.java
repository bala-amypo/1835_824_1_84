package com.example.demo.service.impl;
import com.example.demo.repository.ServicePartRepository;
import com.example.demo.entity.ServicePart;
import com.example.demo.service.ServicePartService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ServicePartServiceImpl implements ServicePartService{

@Autowired
ServicePartRepository spr;
public ServicePart createServicePart(ServicePart spa){

    return spr.save(spa);
}


}