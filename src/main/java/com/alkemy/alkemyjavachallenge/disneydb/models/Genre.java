package com.alkemy.alkemyjavachallenge.disneydb.models;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @SequenceGenerator(
            name = "genre_sequence",
            sequenceName = "genre_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = SEQUENCE,
            generator = "genre_sequence"
    )
    @Column(name = "genreId")
    private Long genreId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String photoPath;

    @ManyToMany(mappedBy = "genres", fetch = FetchType.EAGER)
    private Set<MovieOrShow> movies;

    public Genre(String name, String photoPath) {
        this.name = name;
        this.photoPath = photoPath;
    }

    public Genre() {
    }

    public void addMovie(MovieOrShow movie){
        this.movies.add(movie);
    }

    public Long getId() {
        return genreId;
    }

    public void setId(Long id) {
        this.genreId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
