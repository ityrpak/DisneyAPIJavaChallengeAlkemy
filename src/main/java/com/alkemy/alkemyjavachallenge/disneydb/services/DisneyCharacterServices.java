package com.alkemy.alkemyjavachallenge.disneydb.services;


import com.alkemy.alkemyjavachallenge.disneydb.models.DisneyCharacter;
import com.alkemy.alkemyjavachallenge.disneydb.models.MovieOrShow;
import com.alkemy.alkemyjavachallenge.disneydb.repositories.DisneyCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DisneyCharacterServices {

    @Autowired
    DisneyCharacterRepository dcRepo;

    public List<DisneyCharacter> getCharacters(){
        List characters = new ArrayList();
        List<DisneyCharacter> allCharacters = dcRepo.findAll();
        allCharacters.forEach(
                c -> {
                    Map<String, Object> charactersMap = new HashMap<String, Object>();
                    charactersMap.put("photoUrl",c.getphotoUrl());
                    charactersMap.put("name",c.getName());
                    characters.add(charactersMap);
                }
        );
        return characters;
    }

}
