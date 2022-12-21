package com.sws.swstask.controller;

import com.sws.swstask.forms.UserForm;
import com.sws.swstask.models.User;
import com.sws.swstask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @PostMapping("/adduser")
    public String addUser(UserForm userForm){
        userService.addUser(userForm);
        return "redirect:/users";
    }
}
