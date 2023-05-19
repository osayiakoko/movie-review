package com.osayistreams.moviereview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osayistreams.moviereview.entities.Genre;


public interface GenreRepository extends JpaRepository<Genre, Integer>{
    
}
