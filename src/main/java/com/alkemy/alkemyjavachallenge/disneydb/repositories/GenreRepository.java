package com.alkemy.alkemyjavachallenge.disneydb.repositories;

import com.alkemy.alkemyjavachallenge.disneydb.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    Genre findByGenreId(Long l);


}
