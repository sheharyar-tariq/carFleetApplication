package com.carfleet.app.service;

import com.carfleet.app.dao.VehicleMakeRepository;
import com.carfleet.app.model.VehicleMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {
    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    public List<VehicleMake> getAllVehicleMakes(){
        return vehicleMakeRepository.findAll();
    }
    public void saveVehicleMake(VehicleMake vehicleMake){
        vehicleMakeRepository.save(vehicleMake);
    }
    public Optional<VehicleMake> findById(int vehicleMakeId){
        return vehicleMakeRepository.findById(vehicleMakeId);
    }
    public void deleteById(int vehicleMakeId){
        vehicleMakeRepository.deleteById(vehicleMakeId);
    }

}
