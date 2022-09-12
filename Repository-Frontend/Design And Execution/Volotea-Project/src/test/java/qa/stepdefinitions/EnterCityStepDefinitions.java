package qa.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.models.Destination;
import qa.models.Origin;
import qa.tasks.cities.CityOfDestination;
import qa.tasks.cities.CityOfOrigin;
import qa.tasks.passangers.AddPeople;


import java.util.List;

import static javax.swing.UIManager.get;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class EnterCityStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Ismael Carvajal");

    }

    @When("^the user enter (.*) and the user enter (.*)$")
    public void the_user_enter_cityOrigin(List<Origin> dataOrigin, List<Destination> dataDestination) {
        OnStage.theActorInTheSpotlight().wasAbleTo(CityOfOrigin.cityOfOrigin(dataOrigin.get(0)));
        OnStage.theActorInTheSpotlight().wasAbleTo(CityOfDestination.cityOfDestination(dataDestination.get(0)));
    }


    @Then("^the user should see the name (.*)$")
    public void theUserShouldSeeTheName(String cityOrigin) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(qa.questions.Origin.message(), org.hamcrest.CoreMatchers.is(cityOrigin)));
    }

}

