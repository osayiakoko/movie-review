package com.osayistreams.moviereview.services.movie;

import java.util.List;

import com.osayistreams.moviereview.dto.movie.SaveMovieDto;
import com.osayistreams.moviereview.entities.Movie;


public interface MovieService {
    Movie save(SaveMovieDto movie);

    List<Movie> findAllMovie();

    Movie findById(Integer id);

    Movie update(Movie movie);

    void delete(Integer id);
}
