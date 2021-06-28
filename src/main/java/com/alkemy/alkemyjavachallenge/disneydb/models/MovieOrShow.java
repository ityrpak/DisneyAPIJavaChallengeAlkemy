package com.alkemy.alkemyjavachallenge.disneydb.models;


import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "movie_or_show")
public class MovieOrShow {

    @Id
    @SequenceGenerator(
            name = "movieorshow_sequence",
            sequenceName = "movieorshow_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = SEQUENCE,
            generator = "movieorshow_sequence"
    )
    private Long movieId;

    @Column(nullable = false, length = 300)
    private String photoUrl;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false)
    private Double score;

    @ManyToMany
    @JoinTable(
            name = "movie_genre",
            joinColumns = @JoinColumn(name = "movieId"),
            inverseJoinColumns = @JoinColumn(name = "genreId")
    )
    private Set<Genre> genres;

    public MovieOrShow() {
    }

    @Transactional
    public Set<Genre> getGenres() {
        return genres;
    }

    public void addGenre(Genre genre){
        genres.add(genre);
    }

    public MovieOrShow(String title, String photoUrl, LocalDate creationDate, Double score) {
        this.photoUrl = photoUrl;
        this.title = title;
        this.creationDate = creationDate;
        this.score = score;
    }

    public Long getId() {
        return movieId;
    }

    public void setId(Long id) {
        this.movieId = id;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoPath) {
        this.photoUrl = photoPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }



}
