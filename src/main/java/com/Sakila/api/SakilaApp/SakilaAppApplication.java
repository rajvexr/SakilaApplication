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


	public SakilaAppApplication(ActorRepository actorRepository, FilmRepository filmRepository, CategoryRepository categoryRepository){
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
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

	@DeleteMapping("/Film/{id}")
	@ResponseBody
	public String deleteFilm(@PathVariable Integer id){
		filmRepository.deleteById(id);
		return ("Film successfully deleted");
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

}
