package com.carfleet.app.controller;

import com.carfleet.app.model.Country;
import com.carfleet.app.model.Location;
import com.carfleet.app.model.State;
import com.carfleet.app.service.CountryService;
import com.carfleet.app.service.LocationService;
import com.carfleet.app.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;
    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public String getLocations(Model model){
          List<State> stateList = stateService.getStates();
          List<Country> countryList = countryService.getCountry();
          List<Location> locationList = locationService.getAllLocations();
          model.addAttribute("countries",countryList);
          model.addAttribute("states",stateList);
          model.addAttribute("locations",locationList);
        return "Location";
    }
    @PostMapping("/locations/addNew")
    public String addNew(Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }
    @RequestMapping("/locations/findById")
    @ResponseBody
    public Optional<Location> editLocation(Integer locationId){
        return locationService.findById(locationId);
    }
    @PostMapping("/locations/update")
    public String update(Location location) {
        locationService.saveLocation(location);
        return "redirect:/locations";
    }
    @RequestMapping(value = "/locations/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteLocation(Integer locationId){
        locationService.deleteById(locationId);
        return "redirect:/locations";
    }
}
