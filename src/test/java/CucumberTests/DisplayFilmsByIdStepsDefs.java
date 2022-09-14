package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DisplayFilmsByIdStepsDefs {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    private ActorRepository actorRepository;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private LanguageRepository languageRepository;

    public DisplayFilmsByIdStepsDefs(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        languageRepository = mock(LanguageRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository,
                                                        filmRepository,
                                                        categoryRepository,
                                                        languageRepository);
    }

    Film filmTest;
    Film expected;
    boolean applicationRunning;

    @Given("the application is running")
    public void the_application_is_running() {
        applicationRunning = true;
    }

    @Given("there is an id")
    public void there_is_an_id() {
        int id = 1;
        expected = new Film();
        expected.setFilm_id(1);
        expected.setTitle("this is a film title");
    }

    @When("the film page loads")
    public void the_film_page_loads() {
        filmRepository.findById(1);
    }

    @When("the api connects")
    public void the_api_connects() {
        when(filmRepository.findById(1)).thenReturn(Optional.of(expected));
            filmTest = filmRepository.findById(1).get();
    }

    @Then("display a film")
    public void display_a_film() {
        Assertions.assertEquals(expected, filmTest, "there is an error fetching data for the film");
    }
}
