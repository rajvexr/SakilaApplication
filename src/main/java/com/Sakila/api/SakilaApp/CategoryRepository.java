package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    //identifying a category for a specific film
    @Query(nativeQuery = true, value = "SELECT category.category_id, category.name FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE film.film_id = :id")
    Iterable<Category> getFilmCategory(@PathVariable Integer id);

    //showing all films in a specific category
    @Query(nativeQuery = true, value = "SELECT film.film_id, film.title FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE category.category_id = :id")
    Iterable<Category> getCategoryFilm(@PathVariable Integer id);

}
