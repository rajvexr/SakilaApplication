package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface FilmRepository extends CrudRepository<Film, Integer> {

    //showing all films in a specific category
    @Query(nativeQuery = true, value = "SELECT film.* FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE category.category_id = :id")
    Iterable<Film> getCategoryFilm(@PathVariable Integer id);


    //displays all films with a specific rating
    @Query(nativeQuery = true, value = "SELECT film.* FROM film WHERE film.rating = :id")
    Iterable<Film> getRatings(@PathVariable Integer id);


    //displays an actor with all the films they have participated in
    @Query(nativeQuery = true, value = "SELECT film.* FROM film INNER JOIN film_actor ON film.film_id = film_actor.film_id INNER JOIN actor ON film_actor.actor_id = actor.actor_id WHERE actor.actor_id = :id")
    Iterable<Film> getActorFilms(@PathVariable Integer id);

}
