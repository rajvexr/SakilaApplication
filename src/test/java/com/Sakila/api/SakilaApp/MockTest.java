package com.Sakila.api.SakilaApp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    ActorRepository actorRepository;
    @Mock
    FilmRepository filmRepository;
    @Mock
    CategoryRepository categoryRepository;
    @Mock
    LanguageRepository languageRepository;

    @BeforeEach
    void setup(){
        sakilaAppApplication = new SakilaAppApplication(actorRepository,
                                                        filmRepository,
                                                        categoryRepository,
                                                        languageRepository);
    }

    @Test
    void testAllFilms(){

        List<Film> filmList = new ArrayList<>();

        Film testFilm = new Film("Dragon ball super", "anime", 2021 ,1 ,20, 10.5, 60, 2.50, "PG", "none");
        Film testFilm2 = new Film("hero", "batman", 2001 ,1 ,60, 15.5, 30, 2.50, "PG", "none");

        filmList.add(testFilm);
        filmList.add(testFilm2);

        Iterable<Film> filmIterable = filmList;

        when(filmRepository.findAll()).thenReturn(filmIterable);

        Iterable<Film> Expected = filmIterable;
        Iterable<Film> Actual = sakilaAppApplication.getAllFilms();

        Assertions.assertEquals(Expected, Actual, "get all films which are wrong");
    }


    @Test
    void testAllActors() {

        List<Actor> actorList = new ArrayList<>();

        Actor testActor = new Actor("Rajveer", "Singh");
        Actor testActor2 = new Actor("Nicki", "James");

        actorList.add(testActor);
        actorList.add(testActor2);

        Iterable<Actor> actorIterable = actorList;

        when(actorRepository.findAll()).thenReturn(actorIterable);

        Iterable<Actor> Expected = actorIterable;
        Iterable<Actor> Actual = sakilaAppApplication.getAllActors();

        Assertions.assertEquals(Expected, Actual, "get all actors which are wrong");
    }

    @Test
    void testAllCategory() {

        List<Category> categoryList = new ArrayList<>();

        Category testCategory = new Category("Horror");
        Category testCategory2 = new Category("Action");

        categoryList.add(testCategory);
        categoryList.add(testCategory2);

        Iterable<Category> categoryIterable = categoryList;

        when(categoryRepository.findAll()).thenReturn(categoryIterable);

        Iterable<Category> Expected = categoryIterable;
        Iterable<Category> Actual = sakilaAppApplication.getAllCategory();

        Assertions.assertEquals(Expected, Actual, "get all categories which are wrong");
    }

    @Test
    void testAllLanguage() {

        List<Language> languageList = new ArrayList<>();

        Language testLanguage = new Language("English");
        Language testLanguage2 = new Language("Spanish");

        languageList.add(testLanguage);
        languageList.add(testLanguage2);

        Iterable<Language> languageIterable = languageList;

        when(languageRepository.findAll()).thenReturn(languageIterable);

        Iterable<Language> Expected = languageIterable;
        Iterable<Language> Actual = sakilaAppApplication.getAllLanguage();

        Assertions.assertEquals(Expected, Actual, "get all language which are wrong");
    }

    @Test
    void GetFilmById(){
        Film testFilm = new Film();
        when(filmRepository.findById(1)).thenReturn(Optional.of(testFilm));
        Optional<Film> film = sakilaAppApplication.getFilm(1);
        Film Expected = testFilm;
        Film Actual = film.get();
        Assertions.assertEquals(Expected, Actual, "error");
    }

    @Test
    void GetCategoryById(){
        Category testCategory = new Category();
        when(categoryRepository.findById(1)).thenReturn(Optional.of(testCategory));
        Optional<Category> category = sakilaAppApplication.getCategory(1);
        Category Expected = testCategory;
        Category Actual = category.get();
        Assertions.assertEquals(Expected, Actual, "error");
    }

    @Test
    void GetActorById(){
        Actor testActor = new Actor();
        when(actorRepository.findById(1)).thenReturn(Optional.of(testActor));
        Optional<Actor> actor = sakilaAppApplication.getActor(1);
        Actor Expected = testActor;
        Actor Actual = actor.get();
        Assertions.assertEquals(Expected, Actual, "error");
    }

    @Test
    void GetLanguageById(){
        Language testLanguage = new Language();
        when(languageRepository.findById(1)).thenReturn(Optional.of(testLanguage));
        Optional<Language> language = sakilaAppApplication.getLanguage(1);
        Language Expected = testLanguage;
        Language Actual = language.get();
        Assertions.assertEquals(Expected, Actual, "error");
    }

    @Test
    void GetFilmCategory(){
        Category testFilmCategory = new Category();
        when(categoryRepository.findById(1)).thenReturn(Optional.of(testFilmCategory));
        Iterable<Category> category = sakilaAppApplication.getFilmCategory(1);
        Category Expected = testFilmCategory;
        Category Actual = (Category) category;
        Assertions.assertEquals(Expected, Actual, "error");
    }

}
