package com.carfleet.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home() {
         return "index";
        }

    @GetMapping("/login")
    public String login() {
        return "pages-login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "pages-login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
