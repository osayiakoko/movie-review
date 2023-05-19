package com.osayistreams.moviereview.services.genre;

import java.util.List;

import org.springframework.stereotype.Service;

import com.osayistreams.moviereview.entities.Genre;
import com.osayistreams.moviereview.repositories.GenreRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService{

    private final GenreRepository repository;

    @Override
    public Genre save(Genre genre) {
        return repository.save(genre);
    }

    @Override
    public List<Genre> findAllGenre() {
        return repository.findAll();
    }

    @Override
    public Genre findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Genre update(Genre genre) {
        return repository.save(genre);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
