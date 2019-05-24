package com.hsr.demo.application.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value={"/user","user","customer"})
    public String homepage() {
        return "customer/index";
    }

}
