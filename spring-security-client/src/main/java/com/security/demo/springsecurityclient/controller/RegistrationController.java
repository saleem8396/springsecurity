package com.security.demo.springsecurityclient.controller;


import com.security.demo.springsecurityclient.entity.User;
import com.security.demo.springsecurityclient.model.UserModel;
import com.security.demo.springsecurityclient.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public String registerUser(@RequestBody UserModel userModel){
        User user= userService.register(userModel);
        return "success";
    }
}
