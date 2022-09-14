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

public class DisplayCategoriesByIdStepsDefs {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    private ActorRepository actorRepository;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private LanguageRepository languageRepository;

    public DisplayCategoriesByIdStepsDefs(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        languageRepository = mock(LanguageRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository,
                                                        filmRepository,
                                                        categoryRepository,
                                                        languageRepository);
    }

    Category expected;
    Category categoryTest;


    @Given("the category has an id")
    public void the_category_has_an_id() {
        int id = 1;
        expected = new Category();
        expected.setCategory_id(1);
        expected.setCategory_name("Horror");

    }
    @Given("the database finds an id for the category")
    public void the_database_finds_an_id_for_the_category() {
    categoryRepository.findById(1);
    }
    @When("the category api connects")
    public void the_category_api_connects() {
    when(categoryRepository.findById(1)).thenReturn(Optional.of(expected));
        categoryTest = categoryRepository.findById(1).get();
    }
    @Then("display a categories")
    public void display_a_categories() {
    Assertions.assertEquals(expected, categoryTest, "there is an error fetching data for the category");
    }







}
