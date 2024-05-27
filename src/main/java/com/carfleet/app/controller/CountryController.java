package com.carfleet.app.controller;

import com.carfleet.app.model.Country;
import com.carfleet.app.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;

//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }

    @GetMapping("/countries")
    public String getCountries(Model model){
       List<Country> countryList = countryService.getCountry();
       model.addAttribute("countries",countryList);
        return "Country";
    }

    @PostMapping(value="countries/addNew")
    public String addNew(Country country) {
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

     @RequestMapping("/countries/findById")
     @ResponseBody
      public Optional<Country> editCountry(Integer cntryId){
       return countryService.findById(cntryId);
  }
    @PostMapping("/countries/update")
    public String update(@ModelAttribute("objcountry") Country country) {
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteCountry(Integer cntryId){
        countryService.Delete(cntryId);
        return "redirect:/countries";
    }


}
