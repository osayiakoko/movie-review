package com.osayistreams.moviereview;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.osayistreams.moviereview.entities.Genre;
import com.osayistreams.moviereview.services.genre.GenreService;

@SpringBootApplication
public class MovieReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewApplication.class, args);
	}

	@Bean
	CommandLineRunner populateGenre(GenreService service){
		return args -> {
			if (service.findAllGenre().isEmpty()){
				service.save(Genre.builder().name("Action").build());
				service.save(Genre.builder().name("Comendy").build());
				service.save(Genre.builder().name("Science fiction").build());
				service.save(Genre.builder().name("Adventure").build());
				service.save(Genre.builder().name("History").build());
				service.save(Genre.builder().name("Horror").build());
				service.save(Genre.builder().name("Epic").build());
				service.save(Genre.builder().name("Mystery").build());
				service.save(Genre.builder().name("Romance").build());
				service.save(Genre.builder().name("Drama").build());
			}
		};
	}
}
