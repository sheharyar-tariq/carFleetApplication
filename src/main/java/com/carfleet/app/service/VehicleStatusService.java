package com.carfleet.app.service;

import com.carfleet.app.dao.VehicleStatusRepository;
import com.carfleet.app.model.VehicleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {
    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;

    public List<VehicleStatus> getAllVehicleStatus(){
        return vehicleStatusRepository.findAll();
    }
    public void saveVehicleStatus(VehicleStatus VehicleStatus){
        vehicleStatusRepository.save(VehicleStatus);
    }
    public Optional<VehicleStatus> findById(int VehicleStatusId){
        return vehicleStatusRepository.findById(VehicleStatusId);
    }
    public void deleteById(int VehicleStatusId){
        vehicleStatusRepository.deleteById(VehicleStatusId);
    }

}
