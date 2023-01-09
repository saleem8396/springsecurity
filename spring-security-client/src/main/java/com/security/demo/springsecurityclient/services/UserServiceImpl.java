package com.security.demo.springsecurityclient.services;

import com.security.demo.springsecurityclient.config.WebSecurityServices;
import com.security.demo.springsecurityclient.entity.User;
import com.security.demo.springsecurityclient.model.UserModel;
import com.security.demo.springsecurityclient.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private User user;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Override
    public User register(UserModel userModel) {


        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        user.setRole("USER");

        return user;

    }
}
