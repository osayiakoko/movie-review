package com.osayistreams.moviereview.services.genre;

import java.util.List;

import com.osayistreams.moviereview.entities.Genre;


public interface GenreService {
    Genre save(Genre genre);

    List<Genre> findAllGenre();

    Genre findById(Integer id);

    Genre update(Genre genre);

    void delete(Integer id);
}
