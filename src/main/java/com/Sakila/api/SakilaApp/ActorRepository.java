package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface ActorRepository extends CrudRepository<Actor, Integer> {

    //displays all actors in a specific film
    @Query(nativeQuery = true, value = "SELECT actor.actor_id, actor.first_name, actor.last_name FROM film INNER JOIN film_actor ON film.film_id = film_actor.film_id INNER JOIN actor ON film_actor.actor_id = actor.actor_id WHERE film.film_id = :id")
    Iterable<Actor> getFilmActorsFirstLastName(@PathVariable Integer id);

}
