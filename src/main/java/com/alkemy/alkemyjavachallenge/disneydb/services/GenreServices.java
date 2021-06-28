package com.alkemy.alkemyjavachallenge.disneydb.services;


import com.alkemy.alkemyjavachallenge.disneydb.models.Genre;
import com.alkemy.alkemyjavachallenge.disneydb.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GenreServices {

    @Autowired
    private GenreRepository genreRepo;

    public Genre getGenreById(Long id){
        return genreRepo.getById(id);
    }

}
