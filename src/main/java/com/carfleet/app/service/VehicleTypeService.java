package com.carfleet.app.service;

import com.carfleet.app.dao.VehicleTypeRepository;
import com.carfleet.app.model.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {
    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    public List<VehicleType> getAllVehicleTypes(){
        return vehicleTypeRepository.findAll();
    }
    public void saveVehicleType(VehicleType vehicleType){
        vehicleTypeRepository.save(vehicleType);
    }
    public Optional<VehicleType> findById(int vehicleTypeId){
        return vehicleTypeRepository.findById(vehicleTypeId);
    }
    public void deleteById(int vehicleTypeId){
        vehicleTypeRepository.deleteById(vehicleTypeId);
    }

}
