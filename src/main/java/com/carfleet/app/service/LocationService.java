package com.carfleet.app.service;

import com.carfleet.app.dao.LocationRepository;
import com.carfleet.app.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations(){
        return locationRepository.findAll();
    }
    public void saveLocation(Location location){
        locationRepository.save(location);
    }
    public Optional<Location> findById(int locationId){
        return locationRepository.findById(locationId);
    }
    public void deleteById(int locationId){
        locationRepository.deleteById(locationId);
    }

}
