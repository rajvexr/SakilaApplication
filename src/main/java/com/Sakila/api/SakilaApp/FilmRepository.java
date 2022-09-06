package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface FilmRepository extends CrudRepository<Film, Integer> {


    //displays a film with a rating
    @Query(nativeQuery = true, value = "SELECT film.film_id, film.rating FROM film WHERE film.film_id = :id")
    Iterable<Object> getFilmRating(@PathVariable Integer id);


    //displays all films with a specific rating
    @Query(nativeQuery = true, value = "SELECT film.film_id, film.rating FROM film WHERE film.rating = :id")
    Iterable<Object> getRatings(@PathVariable Integer id);


    //displays an actor with all the films they have participated in
    @Query(nativeQuery = true, value = "SELECT film.film_id, film.title FROM film INNER JOIN film_actor ON film.film_id = film_actor.film_id INNER JOIN actor ON film_actor.actor_id = actor.actor_id WHERE actor.actor_id = :id")
    Iterable<Object> getActorFilms(@PathVariable Integer id);

}
