package com.carfleet.app.controller;

import com.carfleet.app.model.Country;
import com.carfleet.app.model.Location;
import com.carfleet.app.model.State;
import com.carfleet.app.model.VehicleMake;
import com.carfleet.app.service.VehicleMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiclemakeController {
    @Autowired
    private VehicleMakeService vehicleMakeService;

    @GetMapping("/vehicleMake")
    public String getAllvehiclemake(Model model){
        List<VehicleMake> vehicleMakeList = vehicleMakeService.getAllVehicleMakes();
        model.addAttribute("vehicleMakeList",vehicleMakeList);
        return "VehicleMake";
    }

    @PostMapping("/vehicleMake/addNew")
    public String addNew(VehicleMake vehicleMake){
        vehicleMakeService.saveVehicleMake(vehicleMake);
        return "redirect:/vehicleMake";
    }

    @RequestMapping("/vehicleMake/findById")
    @ResponseBody
    public Optional<VehicleMake> editLocation(Integer Id){
        return vehicleMakeService.findById(Id);
    }
    @PostMapping("/vehicleMake/update")
    public String update(VehicleMake vehicleMake) {
        vehicleMakeService.saveVehicleMake(vehicleMake);
        return "redirect:/VehicleMake";
    }
    @RequestMapping(value = "/vehicleMake/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteLocation(Integer locationId){
        vehicleMakeService.deleteById(locationId);
        return "redirect:/VehicleMake";
    }
}
