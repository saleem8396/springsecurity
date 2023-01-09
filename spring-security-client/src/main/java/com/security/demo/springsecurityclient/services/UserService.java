package com.security.demo.springsecurityclient.services;

import com.security.demo.springsecurityclient.entity.User;
import com.security.demo.springsecurityclient.model.UserModel;

public interface UserService {
    User register(UserModel userModel);
}
