package com.carfleet.app.controller;

import com.carfleet.app.model.Location;
import com.carfleet.app.model.VehicleStatus;
import com.carfleet.app.service.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleStatusController {

    @Autowired
    private VehicleStatusService vehicleStatusService;

    @GetMapping("/vehicleStatus")
    public String getAllVehicleStatus(Model model){
        return "vehicleStatus";
    }
    @PostMapping("/vehicleStatus/addNew")
    public String addNew(VehicleStatus vehicleStatus){
        vehicleStatusService.saveVehicleStatus(vehicleStatus);
        return "redirect:/vehicleStatus";
    }
    @RequestMapping("/vehicleStatus/findById")
    @ResponseBody
    public Optional<VehicleStatus> editLocation(Integer vehicleStatusId){
        return vehicleStatusService.findById(vehicleStatusId);
    }
    @PostMapping("/vehicleStatus/update")
    public String update(VehicleStatus vehicleStatus) {
        vehicleStatusService.saveVehicleStatus(vehicleStatus);
        return "redirect:/vehicleStatus";
    }
    @RequestMapping(value = "/vehicleStatus/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteLocation(Integer vehicleStatusId){
        vehicleStatusService.deleteById(vehicleStatusId);
        return "redirect:/vehicleStatus";
    }
}
