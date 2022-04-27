package com.cenfotec.PrjGraphQL.repositories;

import com.cenfotec.PrjGraphQL.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
