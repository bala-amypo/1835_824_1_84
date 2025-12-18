package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ServicePart;
public interface ServicePartrepo extends JpaRepository<ServicePart,Long>{

}