package com.hsr.demo.application.controller.customer;

import com.hsr.demo.application.model.Reservation;
import com.hsr.demo.application.service.IReservationService;
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
public class ReservationController {

    @Autowired
    private IReservationService reservationService;

    @GetMapping(value = "user/loggedIn")
    public String loggedIn(){
        return "secure/index";
    }

    @PostMapping(value = "/save/reservation")
    public String saveUser(@Valid @ModelAttribute("reservation") Reservation reservation,
                           BindingResult bindingResult, Model model, RedirectAttributes redirAttrs) {
        if(bindingResult.hasErrors()){
            return "customer/index";
        }
        reservation=reservationService.save(reservation);
        redirAttrs.addFlashAttribute("message", "Reservation done Sucessfully !!");
        return "redirect:/user/reservation";
    }

}
