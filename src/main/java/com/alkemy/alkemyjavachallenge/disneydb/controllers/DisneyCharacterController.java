package com.alkemy.alkemyjavachallenge.disneydb.controllers;

import com.alkemy.alkemyjavachallenge.disneydb.models.DisneyCharacter;
import com.alkemy.alkemyjavachallenge.disneydb.services.DisneyCharacterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class DisneyCharacterController {

    @Autowired
    private DisneyCharacterServices characterServices;

    @GetMapping
    public List<DisneyCharacter> getCharacters(){
        return characterServices.getCharacters();
    }

}