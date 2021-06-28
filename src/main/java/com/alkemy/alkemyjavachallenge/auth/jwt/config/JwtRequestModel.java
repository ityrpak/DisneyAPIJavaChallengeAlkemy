package com.alkemy.alkemyjavachallenge.auth.jwt.config;

public class JwtRequestModel {


    private String username;
    private String password;


    public JwtRequestModel() {}

    public JwtRequestModel(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


