package com.carfleet.app.service;

import com.carfleet.app.dao.VehicleModelRepository;
import com.carfleet.app.model.VehicleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {
    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    public List<VehicleModel> getAllVehicleModels(){
        return vehicleModelRepository.findAll();
    }
    public void saveVehicleModel(VehicleModel VehicleModel){
        vehicleModelRepository.save(VehicleModel);
    }
    public Optional<VehicleModel> findById(int VehicleModelId){
        return vehicleModelRepository.findById(VehicleModelId);
    }
    public void deleteById(int VehicleModelId){
        vehicleModelRepository.deleteById(VehicleModelId);
    }

}
