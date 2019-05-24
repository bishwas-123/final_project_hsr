package com.hsr.demo.application.controller.admin;

import com.hsr.demo.application.model.Reservation;
import com.hsr.demo.application.model.Room;
import com.hsr.demo.application.model.User;
import com.hsr.demo.application.service.ReservationService;
import com.hsr.demo.application.service.RoomService;
import com.hsr.demo.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping(value = "/hsr")
public class ReservationControl {
    @Autowired
    ReservationService reservationService;
    @Autowired
    UserService userService;
    @Autowired
    RoomService roomService;

    @GetMapping(value = "/reservation")
    public String newReservation(Model model){
        model.addAttribute("reservation", new Reservation());
        return "reservation/home";

    }

    @PostMapping(value = "/savereservation")
    public String addRooms(@Valid @ModelAttribute("reservation") Reservation reservation,
                           BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "reservation/home";
        }
        reservation.setReservationDate(LocalDate.now());
        String confirmationCode=reservation.setConfirmationCode();
        System.out.println("new reservation confirmation code is: "+confirmationCode);
        reservation = reservationService.save(reservation);
        return "redirect:/hsr/reservation";
    }

}
