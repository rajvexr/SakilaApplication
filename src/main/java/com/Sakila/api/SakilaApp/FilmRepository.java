package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface FilmRepository extends CrudRepository<Film, Integer> {
    @Query(nativeQuery = true, value = "SELECT category.category_id, category.name FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE film.film_id = :id")
    Iterable<Object> getFilmCategory(@PathVariable Integer id);
}
