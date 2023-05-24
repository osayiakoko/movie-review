package com.osayistreams.moviereview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osayistreams.moviereview.entities.Movie;


public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
