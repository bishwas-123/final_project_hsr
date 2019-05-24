package com.hsr.demo.application.controller.admin;

import com.hsr.demo.application.model.Room;
import com.hsr.demo.application.model.User;
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
public class UserControl {
    @Autowired
    UserService userService;

    @GetMapping(value = "/hsr/users")
    public String displayHome(){
        return "user/userhome";
    }

    @GetMapping (value = "hsr/users/new")
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "user/newuser";
    }

    @PostMapping(value = "/hsr/user/save")
    public String saveUser(@Valid @ModelAttribute("user") User user,
                           BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "user/newuser";
        }
        user.setCreateDate(LocalDate.now());
        user = userService.save(user);
        return "redirect:/hsr/users";
    }
    @GetMapping(value = "/hsr/users/view")
    public ModelAndView viewRooms() {
        ModelAndView modelAndView = new ModelAndView();
        List<User> roomList = userService.findAll();
        modelAndView.addObject("userList", roomList);
        modelAndView.setViewName("user/viewusers");
        return modelAndView;
    }


}
