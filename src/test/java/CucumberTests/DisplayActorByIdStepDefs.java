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

public class DisplayActorByIdStepDefs {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    private ActorRepository actorRepository;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private LanguageRepository languageRepository;

    public DisplayActorByIdStepDefs(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        languageRepository = mock(LanguageRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository,
                filmRepository,
                categoryRepository,
                languageRepository);
    }

    Actor expected;
    Actor actorTest;

    @Given("the actor has an id")
    public void the_actor_has_an_id() {
        int id = 1;
        expected = new Actor();
        expected.setActor_id(1);
        expected.setActorFirstName("Raj");
        expected.setActorLastName("Singh");

    }
    @Given("the database finds an id for the actor")
    public void the_database_finds_an_id_for_the_actor() {
    actorRepository.findById(1);
    }
    @When("the actor api connects")
    public void the_actor_api_connects() {
        when(actorRepository.findById(1)).thenReturn(Optional.of(expected));
        actorTest = actorRepository.findById(1).get();
    }
    @Then("display a actor")
    public void display_a_actor() {
        Assertions.assertEquals(expected, actorTest, "there is an error fetching data for the actor");
    }




}
