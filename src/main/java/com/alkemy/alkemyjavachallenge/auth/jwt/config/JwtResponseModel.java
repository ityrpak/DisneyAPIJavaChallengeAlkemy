package com.alkemy.alkemyjavachallenge.auth.jwt.config;

import java.io.Serializable;

public class JwtResponseModel {

    private final String jwttoken;

    public JwtResponseModel(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }

}
