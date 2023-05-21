package com.osayistreams.moviereview.services.movie;

import java.util.Set;

import com.osayistreams.moviereview.entities.Movie;


public interface MovieService {
    Movie save(Movie movie);

    Set<Movie> findAllMovie();

    Movie findById(Integer id);

    Movie findByTitle(String title);

    Movie update(Movie movie);

    void delete(Integer id);
}
