package com.osayistreams.moviereview.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.osayistreams.moviereview.dto.genre.GenreRequest;
import com.osayistreams.moviereview.entities.Genre;
import com.osayistreams.moviereview.services.genre.GenreService;

import lombok.RequiredArgsConstructor;


@RequestMapping("v1/genres")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService service;

    @PostMapping
    public Genre saveGenre(@RequestBody GenreRequest genre) {
        return service.save(
            Genre.builder()
            .name(genre.getName())
            .build()
        );
    }

    @GetMapping
    public List<Genre> fetchGenres(){
        return service.findAllGenre();
    }

    @GetMapping("/{id}")
    public Genre fetchGenre(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PatchMapping("/{id}")
    public Genre updatGenre(@PathVariable Integer id, @RequestBody GenreRequest genre) {
        return service.save(
            Genre.builder()
            .id(id)
            .name(genre.getName())
            .build()
        );
    }

    @DeleteMapping("/{id}")
    public void removeGenre(@PathVariable Integer id) {
        service.delete(id);
    }
}
