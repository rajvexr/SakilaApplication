package com.Sakila.api.SakilaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
@CrossOrigin
public class SakilaAppApplication {

	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;
	private CategoryRepository categoryRepository;
	private LanguageRepository languageRepository;


	public SakilaAppApplication(ActorRepository actorRepository, FilmRepository filmRepository, CategoryRepository categoryRepository, LanguageRepository languageRepository){
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
		this.languageRepository = languageRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaAppApplication.class, args);}

	////Actors

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/Actor/{id}")
	@ResponseBody
	public Optional<Actor> getActor(@PathVariable Integer id){
		return actorRepository.findById(id);
	}

	@PostMapping("/Actor")
	@ResponseBody
	public String addActor(@RequestBody Actor actor){
		actorRepository.save(actor);
		return ("Actor successfully added!");
	}

	@DeleteMapping("/Actor/{id}")
	@ResponseBody
	public String deleteActor(@PathVariable Integer id){
		actorRepository.deleteById(id);
		return ("Actor successfully deleted");
	}

	@PutMapping("/Actor/{id}")
	@ResponseBody
	public String updateActor(@PathVariable Integer id, @RequestBody Actor newActor){
		final Actor actor = actorRepository.findById(id).get();
		actor.setActorFirstName(newActor.actorFirstName);
		actor.setActorLastName(newActor.actorLastName);
		actorRepository.save(actor);
		return ("Actor has been successfully updated!");
	}

	/////Films

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/Film/{id}")
	@ResponseBody
	public Optional<Film> getFilm(@PathVariable Integer id){
		return filmRepository.findById(id);
	}

	@PostMapping("/Film")
	@ResponseBody
	public String addFilm(@RequestBody Film film){
		filmRepository.save(film);
		return ("Film successfully added!");
	}

	@GetMapping("/filmActorFirstLastName/{id}")
	@ResponseBody
	Iterable<Actor> getFilmActorsFirstLastName(@PathVariable Integer id){
		return actorRepository.getFilmActorsFirstLastName(id);
	}

	@GetMapping("/filmRating/{id}")
	@ResponseBody
	Iterable<Object> getFilmRating(@PathVariable Integer id){
		return filmRepository.getFilmRating(id);
	}

	@GetMapping("/Rating/{id}")
	@ResponseBody
	Iterable<Object> getRatings(@PathVariable Integer id){
		return filmRepository.getRatings(id);
	}

	@GetMapping("/actorFilms/{id}")
	@ResponseBody
	Iterable<Object> getActorFilms(@PathVariable Integer id){
		return filmRepository.getActorFilms(id);
	}

	@DeleteMapping("/Film/{id}")
	@ResponseBody
	public String deleteFilm(@PathVariable Integer id){
		filmRepository.deleteById(id);
		return ("Film successfully deleted");
	}

	@PutMapping("/Film/{id}")
	@ResponseBody
	public String updateFilm(@PathVariable Integer id, @RequestBody Film newFilm){
		final Film film = filmRepository.findById(id).get();
		film.setTitle(newFilm.title);
		film.setDescription(newFilm.description);
		film.setRelease_year(newFilm.release_year);
		film.setLanguage_id(newFilm.language_id);
		film.setRental_duration(newFilm.rental_duration);
		film.setRental_rate(newFilm.rental_rate);
		film.setLength(newFilm.length);
		film.setReplacement_cost(newFilm.replacement_cost);
		film.setRating(newFilm.rating);
		film.setSpecial_features(newFilm.special_features);
		filmRepository.save(film);
		return ("Film has been successfully updated!");
	}

	////Category

	@GetMapping("/allCategory")
	public @ResponseBody
	Iterable<Category> getAllCategory(){
		return categoryRepository.findAll();
	}

	@GetMapping("/Category/{id}")
	@ResponseBody
	public Optional<Category> getCategory(@PathVariable Integer id){
		return categoryRepository.findById(id);
	}

	@GetMapping("/filmCategory/{id}") //identifying a category for a specific film
	@ResponseBody
	public Iterable<Category> getFilmCategory(@PathVariable Integer id){
		return categoryRepository.getFilmCategory(id);
	}

	@GetMapping("/categoryFilm/{id}")
	@ResponseBody
	public Iterable<Category> getCategoryFilm(@PathVariable Integer id){
		return categoryRepository.getCategoryFilm(id);
	}


	@PostMapping("/Category")
	@ResponseBody
	public String addCategory(@RequestBody Category category){
		categoryRepository.save(category);
		return ("Category successfully added!");
	}

	@DeleteMapping("/Category/{id}")
	@ResponseBody
	public String deleteCategory(@PathVariable Integer id){
		categoryRepository.deleteById(id);
		return ("Category successfully deleted");
	}

	@PutMapping("/Category/{id}")
	@ResponseBody
	public String updateCategory(@PathVariable Integer id, @RequestBody Category newCategory){
		final Category category = categoryRepository.findById(id).get();
		category.setCategory_name(newCategory.category_name);
		categoryRepository.save(category);
		return ("Category has been successfully updated!");
	}

	////Language

	@GetMapping("/allLanguage")
	public @ResponseBody
	Iterable<Language> getAllLanguage(){
		return languageRepository.findAll();
	}

	@GetMapping("/Language/{id}")
	@ResponseBody
	public Optional<Language> getLanguage(@PathVariable Integer id){
		return languageRepository.findById(id);
	}

	@PostMapping("/Language")
	@ResponseBody
	public String addLanguage(@RequestBody Language language){
		languageRepository.save(language);
		return ("Language successfully added!");
	}

	@DeleteMapping("/Language/{id}")
	@ResponseBody
	public String deleteLanguage(@PathVariable Integer id){
		languageRepository.deleteById(id);
		return ("Language successfully deleted");
	}

	@PutMapping("/Language/{id}")
	@ResponseBody
	public String updateLanguage(@PathVariable Integer id, @RequestBody Language newLanguage){
		final Language language = languageRepository.findById(id).get();
		language.setLanguage_name(newLanguage.language_name);
		languageRepository.save(language);
		return ("Language has been successfully updated!");
	}

}
