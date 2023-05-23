package com.osayistreams.moviereview.services.movie;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.osayistreams.moviereview.dto.movie.SaveMovieDto;
import com.osayistreams.moviereview.entities.Genre;
import com.osayistreams.moviereview.entities.Movie;
import com.osayistreams.moviereview.repositories.GenreRepository;
import com.osayistreams.moviereview.repositories.MovieRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieRepository repository;
    private final GenreRepository genreRepo;

    @Override
    @Transactional
    public Movie save(SaveMovieDto movie) {
        Set<Genre> movieGenres = Set.copyOf(
            genreRepo.findAllById(movie.getGenreIds())
        );

        LocalDate timeStamp = LocalDate.now();

        return repository.save(
            Movie.builder()
            .title(movie.getTitle())
            .overview(movie.getOverview())
            .genres(movieGenres)
            .releaseDate(movie.getReleasDate())
            .ratingCount(0)
            .ratingAverage(0.0f)
            .createdAt(timeStamp)
            .updatedAt(timeStamp)
            .build()    
        );
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
