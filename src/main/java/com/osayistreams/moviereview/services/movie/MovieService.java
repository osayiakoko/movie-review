package com.osayistreams.moviereview.services.movie;

import java.util.List;

import com.osayistreams.moviereview.entities.Movie;


public interface MovieService {
    Movie save(Movie movie);

    List<Movie> findAllMovie();

    Movie findById(Integer id);

    Movie findByTitle(String title);

    Movie update(Movie movie);

    void delete(Integer id);
}
