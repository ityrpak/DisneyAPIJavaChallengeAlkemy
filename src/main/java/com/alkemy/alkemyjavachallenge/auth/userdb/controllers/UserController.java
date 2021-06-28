package com.alkemy.alkemyjavachallenge.auth.userdb.controllers;


import com.alkemy.alkemyjavachallenge.auth.security.Roles;
import com.alkemy.alkemyjavachallenge.auth.userdb.models.UserModel;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.List;

public class UserController{

    private final PasswordEncoder passwordEncoder;

    public UserController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    private List<UserModel> getUserModels(){
        List userModels = Arrays.asList(
                new UserModel(
                        "admin",
                        passwordEncoder.encode("1234"),
                        "maildeladmin@admin.com",
                        Roles.ADMIN
                )
        );
        return userModels;
    }


}
