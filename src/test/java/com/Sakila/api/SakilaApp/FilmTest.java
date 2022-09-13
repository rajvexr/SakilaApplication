package com.Sakila.api.SakilaApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {

    @Test
    void getFilmTitle(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals("Batman", film.getTitle(), "that's not the correct title of the film");
    }

    @Test
    void getFilmDescription(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals("super-hero", film.getDescription(), "that's not the correct description of the film");
    }

    @Test
    void getFilmReleaseYear(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals(2021, film.getRelease_year(), "that's not the correct release year of the film");
    }

    @Test
    void getFilmLanguageId(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals(1, film.getLanguage_id(), "that's not the correct language id of the film");
    }

    @Test
    void getFilmRentalDuration(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals(20, film.getRental_duration(), "that's not the correct rental duration of the film");
    }

    @Test
    void getFilmRentalRate(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals(10.5, film.getRental_rate(), "that's not the correct rental rate of the film");
    }

    @Test
    void getFilmLength(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals(60, film.getLength(), "that's not the correct length of the film");
    }

    @Test
    void getFilmReplacementCost(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals(2.50, film.getReplacement_cost(), "that's not the correct replacement cost of the film");
    }

    @Test
    void getFilmRating(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals("PG", film.getRating(), "that's not the correct rating of the film");
    }

    @Test
    void getFilmSpecial(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        assertEquals("none", film.getSpecial_features(), "that's not the correct special features of the film");
    }

    @Test
    void setFilmTitle(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setTitle("Superman");
        assertEquals("Superman", film.getTitle(), "that's not the correct title of the film");
    }

    @Test
    void setFilmDescription(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setDescription("a superhero who defeats a villain");
        assertEquals("a superhero who defeats a villain", film.getDescription(), "that's not the correct description of the film");
    }

    @Test
    void setFilmReleaseYear(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setRelease_year(2007);
        assertEquals(2007, film.getRelease_year(), "that's not the correct release year of the film");
    }

    @Test
    void setFilmLanguageId(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setLanguage_id(3);
        assertEquals(3, film.getLanguage_id(), "that's not the correct language id of the film");
    }

    @Test
    void setFilmRentalDuration(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setRental_duration(28);
        assertEquals(28, film.getRental_duration(), "that's not the correct rental duration of the film");
    }

    @Test
    void setFilmRentalRate(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setRental_rate(15.75);
        assertEquals(15.75, film.getRental_rate(), "that's not the correct rental rate of the film");
    }

    @Test
    void setFilmLength(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setLength(140);
        assertEquals(140, film.getLength(), "that's not the correct length of the film");
    }

    @Test
    void setFilmReplacementCost(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setReplacement_cost(7.50);
        assertEquals(7.50, film.getReplacement_cost(), "that's not the correct replacement cost of the film");
    }

    @Test
    void setFilmRating(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setRating("R");
        assertEquals("R", film.getRating(), "that's not the correct rating of the film");
    }

    @Test
    void setFilmSpecial(){
        Film film = new Film("Batman", "super-hero", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        film.setSpecial_features("special character will appear in end credits");
        assertEquals("special character will appear in end credits", film.getSpecial_features(), "that's not the correct special features of the film");
    }

}
