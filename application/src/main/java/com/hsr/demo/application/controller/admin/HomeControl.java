package com.hsr.demo.application.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControl {

    @GetMapping(value = {"/admin", "admin/home","hsr","/hsr/admin"})
    public String displayHome(){
        return"homepage/index";
    }
}
