package CucumberTests;

import com.Sakila.api.SakilaApp.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class DisplayAllCategoriesStepsDefs{

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    private ActorRepository actorRepository;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private LanguageRepository languageRepository;

    public DisplayAllCategoriesStepsDefs(){
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        languageRepository = mock(LanguageRepository.class);
        sakilaAppApplication = new SakilaAppApplication(actorRepository,
                                                        filmRepository,
                                                        categoryRepository,
                                                        languageRepository);
    }



    @When("the category page loads")
    public void the_category_page_loads() {

    }

    @When("the category api connects")
    public void the_category_api_connects() {

    }

    @Then("display all categories")
    public void display_all_categories() {

    }





}
