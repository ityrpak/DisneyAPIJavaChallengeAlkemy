package com.alkemy.alkemyjavachallenge.disneydb.repositories;

import com.alkemy.alkemyjavachallenge.disneydb.models.DisneyCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisneyCharacterRepository extends JpaRepository<DisneyCharacter, Long> {


}
