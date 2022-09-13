package com.Sakila.api.SakilaApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {

    @Test
    void getFilmId(){
        Film film = new Film();
        film.setFilm_id(1);
        assertEquals(1, film.getFilm_id(), "that's not the correct id of the film");
    }

    @Test
    void getFilmTitle(){
        Film film = new Film();
        film.setTitle("Batman");
        assertEquals("Batman", film.getTitle(), "that's not the correct title of the film");
    }

    @Test
    void getFilmDescription(){
        Film film = new Film();
        film.setDescription("a superhero who defeats a villain");
        assertEquals("a superhero who defeats a villain", film.getDescription(), "that's not the correct description of the film");
    }

    @Test
    void getFilmReleaseYear(){
        Film film = new Film();
        film.setRelease_year(2021);
        assertEquals(2021, film.getRelease_year(), "that's not the correct release year of the film");
    }

    @Test
    void getFilmLanguageId(){
        Film film = new Film();
        film.setLanguage_id(1);
        assertEquals(1, film.getLanguage_id(), "that's not the correct language id of the film");
    }

    @Test
    void getFilmRentalDuration(){
        Film film = new Film();
        film.setRental_duration(20);
        assertEquals(20, film.getRental_duration(), "that's not the correct rental duration of the film");
    }

    @Test
    void getFilmRentalRate(){
        Film film = new Film();
        film.setRental_rate(10.5);
        assertEquals(10.5, film.getRental_rate(), "that's not the correct rental rate of the film");
    }

    @Test
    void getFilmLength(){
        Film film = new Film();
        film.setLength(60);
        assertEquals(60, film.getLength(), "that's not the correct length of the film");
    }

    @Test
    void getFilmReplacementCost(){
        Film film = new Film();
        film.setReplacement_cost(2.50);
        assertEquals(2.50, film.getReplacement_cost(), "that's not the correct replacement cost of the film");
    }

    @Test
    void getFilmRating(){
        Film film = new Film();
        film.setRating("PG");
        assertEquals("PG", film.getRating(), "that's not the correct rating of the film");
    }

    @Test
    void getFilmSpecial(){
        Film film = new Film();
        film.setSpecial_features("none");
        assertEquals("none", film.getSpecial_features(), "that's not the correct special features of the film");
    }

}
