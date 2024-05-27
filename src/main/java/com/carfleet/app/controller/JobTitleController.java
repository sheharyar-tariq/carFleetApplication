package com.carfleet.app.controller;

import com.carfleet.app.model.JobTitle;
import com.carfleet.app.service.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class JobTitleController {
    @Autowired
    public JobTitleService jobTitleService;

    @GetMapping("/JobTitle")
    public String getAllJobTitle(Model model){
        return "JobTitle";
    }
    @PostMapping("/JobTitle/addNew")
    public String addNew(JobTitle JobTitle){
        jobTitleService.saveJobTitle(JobTitle);
        return "redirect:/JobTitle";
    }
    @RequestMapping("/JobTitle/findById")
    @ResponseBody
    public Optional<JobTitle> editLocation(Integer locationId){
        return jobTitleService.findById(locationId);
    }
    @PostMapping("/JobTitle/update")
    public String update(JobTitle JobTitle) {
        jobTitleService.saveJobTitle(JobTitle);
        return "redirect:/JobTitle";
    }
    @RequestMapping(value = "/JobTitle/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteLocation(Integer jobTitleId){
        jobTitleService.deleteById(jobTitleId);
        return "redirect:/JobTitle";
    }
}
