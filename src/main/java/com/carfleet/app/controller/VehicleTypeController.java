package com.carfleet.app.controller;

import com.carfleet.app.model.Location;
import com.carfleet.app.model.VehicleType;
import com.carfleet.app.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleTypeController {
    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping("/vehicleType")
    public String getVehicleType(Model model){
        List<VehicleType> vehicleTypeList = vehicleTypeService.getAllVehicleTypes();
        model.addAttribute("vehicleTypes",vehicleTypeList);
        return "VehicleType";
    }
    @PostMapping("/vehicleType/addNew")
    public String addNew(VehicleType vehicleType){
        vehicleTypeService.saveVehicleType(vehicleType);
        return "redirect:/vehicleType";
    }
    @RequestMapping("/vehicleType/findById")
    @ResponseBody
    public Optional<VehicleType> editVehivleType(Integer vehicleTypeId){
        return vehicleTypeService.findById(vehicleTypeId);
    }
    @PostMapping("/vehicleType/update")
    public String update(VehicleType vehicleType) {
        vehicleTypeService.saveVehicleType(vehicleType);
        return "redirect:/vehicleType";
    }
    @RequestMapping(value = "/vehicleType/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deletevehicleType(Integer vehicleTypeId){
        vehicleTypeService.deleteById(vehicleTypeId);
        return "redirect:/vehicleType";
    }

}
