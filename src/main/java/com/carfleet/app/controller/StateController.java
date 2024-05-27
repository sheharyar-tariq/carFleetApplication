package com.carfleet.app.controller;

import com.carfleet.app.model.Country;
import com.carfleet.app.model.State;
import com.carfleet.app.service.CountryService;
import com.carfleet.app.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController{

    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;

    @GetMapping("/states")
    public String getStates(Model model){
        List<State> stateList =  stateService.getStates();
        model.addAttribute("states",stateList);
        model.addAttribute("countries",countryService.getCountry());
        return "States";
    }
    @PostMapping("/states/addNew")
    public String addNew(State state){
        stateService.SaveState(state);
        return "redirect:/states";
    }
    @RequestMapping("/states/findById")
    @ResponseBody
    public Optional<State> editStates(Integer stateId){
        return stateService.findById(stateId);
    }
    @PostMapping("/states/update")
    public String update(@ModelAttribute("objstates") State state) {
        stateService.SaveState(state);
        return "redirect:/states";
    }
//    @RequestMapping(value = "/states/update",method = {RequestMethod.PUT,RequestMethod.GET})
//    public String update(State state){
//        stateService.SaveState(state);
//        return "redirect:/states";
//}

    @RequestMapping(value = "/states/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteState(Integer stateId){
        stateService.DeleteState(stateId);
        return "redirect:/states";
    }
}
