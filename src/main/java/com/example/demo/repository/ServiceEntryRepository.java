package com.example.demo.repository;

import com.example.demo.model.ServiceEntry;
import com.example.demo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ServiceEntryRepository extends JpaRepository<ServiceEntry, Long> {

    // Latest service entry for a vehicle (by odometerReading)
    Optional<ServiceEntry> findTopByVehicleOrderByOdometerReadingDesc(Vehicle vehicle);

    // All entries for a vehicle
    List<ServiceEntry> findByVehicleId(Long vehicleId);

    // Entries for a garage with minimum odometer
    List<ServiceEntry> findByGarageIdAndOdometerReadingGreaterThanEqual(
            Long garageId,
            int odometerReading
    );

    // Entries by vehicle and date range
    List<ServiceEntry> findByVehicleIdAndServiceDateBetween(
            Long vehicleId,
            LocalDate startDate,
            LocalDate endDate
    );
}
