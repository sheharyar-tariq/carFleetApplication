package com.carfleet.app.dao;


import com.carfleet.app.model.CommonObject;
import com.carfleet.app.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {

}

