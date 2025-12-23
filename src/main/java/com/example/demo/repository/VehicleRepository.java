package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.model.Vehicle;
import java.util.List;
public interface VehicleRepository extends JpaRepository<Vehicle,Long>{
@Query("FROM Vehicle v where v.vin= :name")
List<Vehicle> findByOwner(@Param("name") String name);

}