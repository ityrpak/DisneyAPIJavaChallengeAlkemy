package com.alkemy.alkemyjavachallenge.disneydb.controllers;

import com.alkemy.alkemyjavachallenge.disneydb.models.MovieOrShow;
import com.alkemy.alkemyjavachallenge.disneydb.services.MovieOrShowServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieOrShowController {

    @Autowired
    private MovieOrShowServices movieServices;

    @GetMapping
    public List<MovieOrShow> getMovies(){
        return movieServices.getMovies();
    }

    @PostMapping
    public void insertMovie(@RequestBody MovieOrShow movieOrShow){
        MovieOrShow movie = movieServices.preProcessMovie(movieOrShow);
        movieServices.save(movie);
        System.out.println(movie);
    }

    @PutMapping(path = "{movieId}")
    public void updateMovie(@PathVariable("movieId") Long movieId,
                            @RequestBody MovieOrShow movie) {
        movieServices.updateMovie(movie, movieId);
    }

    @DeleteMapping(path = "{movieId}")
    public void deleteMovie(@PathVariable("movieId") Long movieId){
        movieServices.deleteMovieById(movieId);
    }


}
