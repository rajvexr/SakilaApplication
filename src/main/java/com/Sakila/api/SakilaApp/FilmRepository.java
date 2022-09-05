package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface FilmRepository extends CrudRepository<Film, Integer> {

    //films in a specific category
    @Query(nativeQuery = true, value = "SELECT category.category_id, category.name FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE film.film_id = :id")
    Iterable<Object> getFilmCategory(@PathVariable Integer id);


    //displays film rating
    @Query(nativeQuery = true, value = "SELECT film.film_id, film.rating FROM film WHERE film.film_id = :id")
    Iterable<Object> getFilmRating(@PathVariable Integer id);


    //displays all actors in a specific film
    @Query(nativeQuery = true, value = "SELECT actor.actor_id, actor.first_name, actor.last_name FROM film INNER JOIN film_actor ON film.film_id = film_actor.film_id INNER JOIN actor ON film_actor.actor_id = actor.actor_id WHERE film.film_id = :id")
    Iterable<Object> getFilmActorsFirstLastName(@PathVariable Integer id);


    //displays an actor with all the films they have participated in
    @Query(nativeQuery = true, value = "SELECT film.film_id, film.title FROM film INNER JOIN film_actor ON film.film_id = film_actor.film_id INNER JOIN actor ON film_actor.actor_id = actor.actor_id WHERE actor.actor_id = :id")
    Iterable<Object> getActorFilms(@PathVariable Integer id);


}
