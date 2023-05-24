package com.osayistreams.moviereview.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osayistreams.moviereview.dto.movie.SaveMovieDto;
import com.osayistreams.moviereview.entities.Movie;
import com.osayistreams.moviereview.services.movie.MovieService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/v1/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService service;

    @PostMapping
    public Movie saveMovie(@RequestBody SaveMovieDto movie){
        return service.save(movie);
    }

    @GetMapping
    public List<Movie> findAllMovie() {
        return service.findAllMovie();
    }

    @GetMapping("/{id}")
    public Movie findMovie(@PathVariable() Integer id) {
        return service.findById(id);
    }
    
}
