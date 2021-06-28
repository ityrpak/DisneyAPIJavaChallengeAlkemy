package com.alkemy.alkemyjavachallenge.disneydb.services;


import com.alkemy.alkemyjavachallenge.disneydb.models.Genre;
import com.alkemy.alkemyjavachallenge.disneydb.models.MovieOrShow;
import com.alkemy.alkemyjavachallenge.disneydb.repositories.MovieOrShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.*;


@Service
public class MovieOrShowServices {

    @Autowired
    private MovieOrShowRepository movieShowRepo;

    @Autowired
    private GenreServices genreServices;

    public void save(MovieOrShow movie){
        movieShowRepo.save(movie);
    }

    public MovieOrShow preProcessMovie(MovieOrShow movieOrShow){
        MovieOrShow movie = new MovieOrShow(
                movieOrShow.getTitle(),
                movieOrShow.getPhotoUrl(),
                movieOrShow.getCreationDate(),
                movieOrShow.getScore()
        );
        return movie;
    }

    public List<MovieOrShow> getMovies(){
        List movies = new ArrayList();
        List<MovieOrShow> allMovies = movieShowRepo.findAll();
        allMovies.forEach(
                m -> {
                    Map<String, Object> moviesMap = new HashMap<String, Object>();
                    moviesMap.put("photoUrl",m.getPhotoUrl());
                    moviesMap.put("title",m.getTitle());
                    moviesMap.put("creationDate",m.getCreationDate());
                    movies.add(moviesMap);
                }
        );
        return movies;
    }

    @Transactional
    public MovieOrShow getMovieById(Long id) throws EntityNotFoundException {
        return movieShowRepo.getById(id);
    }

    public void updateMovie(MovieOrShow movieNew, Long id){
        MovieOrShow movieOld = getMovieById(id);
        movieOld.setTitle(movieNew.getTitle());
        movieOld.setScore(movieNew.getScore());
        movieOld.setCreationDate(movieNew.getCreationDate());
        movieOld.setPhotoUrl(movieNew.getPhotoUrl());
        movieShowRepo.save(movieOld);
    }

    public void deleteMovieById(Long id){
        movieShowRepo.deleteById(id);
    }

    public void addGenre(Long movieId, Long genreId){

//        MovieOrShow movie = getMovieById(movieId);
//        movie
//                .addGenre(genreServices.getGenreById(genreId));
//        movieShowRepo.save(movie);
    }

}
