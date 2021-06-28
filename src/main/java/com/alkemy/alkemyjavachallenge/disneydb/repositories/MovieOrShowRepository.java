package com.alkemy.alkemyjavachallenge.disneydb.repositories;

import com.alkemy.alkemyjavachallenge.disneydb.models.MovieOrShow;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieOrShowRepository extends JpaRepository<MovieOrShow, Long> {

}
