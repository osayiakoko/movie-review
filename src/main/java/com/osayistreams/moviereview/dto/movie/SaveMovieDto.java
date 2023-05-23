package com.osayistreams.moviereview.dto.movie;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveMovieDto {

    private String title;

    private String overview;

    private List<Integer> genreIds;

    private LocalDate releasDate;
}
