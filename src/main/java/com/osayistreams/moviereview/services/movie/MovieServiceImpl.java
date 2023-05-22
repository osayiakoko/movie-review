package com.osayistreams.moviereview.services.movie;

import java.util.List;

import org.springframework.stereotype.Service;

import com.osayistreams.moviereview.entities.Movie;
import com.osayistreams.moviereview.repositories.MovieRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieRepository repository;

    @Override
    public Movie save(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public List<Movie> findAllMovie() {
        return repository.findAll();
    }

    @Override
    public Movie findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Movie findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public Movie update(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
    
}
