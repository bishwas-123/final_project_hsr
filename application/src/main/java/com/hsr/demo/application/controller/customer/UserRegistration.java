package com.hsr.demo.application.controller.customer;


import com.hsr.demo.application.model.Reservation;
import com.hsr.demo.application.model.User;
import com.hsr.demo.application.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


@Controller
public class UserRegistration {

    @Autowired
    private IUserService userService;

//    @GetMapping(value="user/check")
//    public String chekuser(){
//        return "customer/rooms";
//    }

    @GetMapping(value="user/login")
    public String login(Model model)
    {
        model.addAttribute("users", new User());
        return "customer/login";
    }
    @PostMapping(value = "/saveuser")
    public String saveUser(@Valid @ModelAttribute("user") User user,
                           BindingResult bindingResult, Model model,RedirectAttributes redirAttrs) {
           if(bindingResult.hasErrors()){
               return "customer/index";
           }
        user=userService.save(user);
      redirAttrs.addFlashAttribute("message", "User Registered Sucessfully !!");
        return "redirect:/user/login";
    }
    @GetMapping(value="user/rooms")
    public String viewRoom(){
        return "customer/rooms";
    }

    @GetMapping(value = "user/reservation")
public String doReservation(Model model){
        model.addAttribute("reservation",new Reservation());
        return "customer/secure/reservation";
    }

}
