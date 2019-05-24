package com.hsr.demo.application.controller.admin;

import com.hsr.demo.application.model.Room;
import com.hsr.demo.application.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/hsr")
public class RoomControl {

    @Autowired
    IRoomService roomService;

    @GetMapping(value = "/viewrooms")
    public ModelAndView viewRooms(){
        ModelAndView modelAndView = new ModelAndView();
        List<Room> roomList=roomService.findAll();
        modelAndView.addObject("roomList", roomList);
        modelAndView.setViewName("admin/roomlist");
        return modelAndView;
    }

    @GetMapping(value = "/newroom")
    public String newRooms(Model model){
        model.addAttribute("newroom", new Room());
        return "admin/newroom";
    }

    @PostMapping(value = "/newroom")
    public String addRooms(@Valid @ModelAttribute("room") Room room,
                                 BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "admin/newroom";
        }
        room = roomService.save(room);
        return "redirect:/hsr/viewrooms";
    }

    @GetMapping(value = "/rooms/edit/{roomId}")
    public String editRoom(@PathVariable Integer roomId, Model model) {
        Room room = roomService.findById(roomId);
        if (room != null) {
            model.addAttribute("room", room);
            return "admin/editroom";
        }
        return "admin/roomlist";
    }
    @PostMapping(value = "/room/save")
    public String updateProduct(@Valid @ModelAttribute("room") Room room,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "admin/editroom";
        }
        roomService.save(room);
        return "redirect:/hsr/viewrooms";
    }
}
