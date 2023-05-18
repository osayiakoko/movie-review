package com.osayistreams.moviereview.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String overview;

    private String posterUrl;

    private LocalDate releaseDate;

    private int voteCount;
    
    private float voteAverage;
}
