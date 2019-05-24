package com.hsr.demo.application.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EventControl {
    @GetMapping(value = "hsr/events")
    public String displayPackages(){
        return "events/home";
    }
}

