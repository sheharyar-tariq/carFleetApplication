package com.carfleet.app.dao;


import com.carfleet.app.model.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer> {

}

