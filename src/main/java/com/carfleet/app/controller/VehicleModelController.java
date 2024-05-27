package com.carfleet.app.controller;

import com.carfleet.app.model.VehicleModel;
import com.carfleet.app.service.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleModelController {
    @Autowired
    private VehicleModelService vehicleModelService;

    @GetMapping("/vehicleModel")
    public String getAllVehicleModel(Model model){
        List<VehicleModel> vehicleModelList = vehicleModelService.getAllVehicleModels();
        model.addAttribute("vehicleModelList",vehicleModelList);
        return "VehicleModel";
    }
    @PostMapping("/vehiclemodel/addNew")
    public String addNew(VehicleModel vehicleModel){
        vehicleModelService.saveVehicleModel(vehicleModel);
        return "redirect: /vehicleModel";
    }
    @RequestMapping(value="/vehicleModel/findById")
    @ResponseBody
    public Optional<VehicleModel> editVehicleModel(Integer vehicleModelId){
        return vehicleModelService.findById(vehicleModelId);
    }

}
