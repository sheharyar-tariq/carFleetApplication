package com.carfleet.app.controller;


import com.carfleet.app.model.Client;
import com.carfleet.app.model.State;
import com.carfleet.app.service.ClientService;
import com.carfleet.app.service.CountryService;
import com.carfleet.app.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {
    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private ClientService clientService;


    @GetMapping("/clients")
    public String getStates(Model model){
        model.addAttribute("clients",clientService.getClients());
        model.addAttribute("states",stateService.getStates());
        model.addAttribute("countries",countryService.getCountry());
        return "Clients";
    }
    @PostMapping("/clients/addNew")
    public String addNew(Client client){
        clientService.SaveClient(client);
        return "redirect:/clients";
    }
    @RequestMapping("/clients/findById")
    @ResponseBody
    public Optional<Client> editClients(Integer clientId){
        System.out.println("Out put "+clientService.findById(clientId));
        return clientService.findById(clientId);
    }
    @PostMapping("/clients/update")
    public String update(@ModelAttribute("objclients") Client client) {
        clientService.SaveClient(client);
        return "redirect:/clients";
    }
    @RequestMapping(value = "/clients/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteClient(Integer clientId){
        clientService.DeleteClient(clientId);
        return "redirect:/clients";
    }
}
