package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Query("SELECT v FROM Vehicle v WHERE v.vin = :vin")
    List<Vehicle> findByVin(@Param("vin") String vin);

    @Query("SELECT v FROM Vehicle v WHERE v.ownerId = :ownerId")
    List<Vehicle> findByOwnerId(@Param("ownerId") Long ownerId);

    Optional<Vehicle> findFirstByVin(String vin);
}
