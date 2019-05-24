package com.hsr.demo.application.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hsr")
public class PackageControl {
    @GetMapping(value = "/packages")
    public String displayPackages(){
        return "packages/home";
    }
}

