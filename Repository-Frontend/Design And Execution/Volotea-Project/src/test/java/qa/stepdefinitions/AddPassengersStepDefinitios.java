package qa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import qa.tasks.*;
import qa.tasks.passangers.*;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AddPassengersStepDefinitios {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Ismael Carvajal");
    }

    @Given("^the user has entered the volotea page$")
    public void theUserHasEnteredTheVoloteaPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenBrowser.browser());
    }

    @Given("^accept cookies$")
    public void acceptCookies() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AcceptCookies.acceptCookies());
    }

    @When("^the user clicks on the passenger field$")
    public void theUserClicksOnThePassengerField() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AddPeople.addPeople());
    }

    @When("^choose number of '(\\d+)', '(\\d+)' and '(\\d+)'$")
    public void chooseNumberOfAnd(int arg1, int arg2, int arg3) {

            for(int i = 0; i<= arg1; i++){
                OnStage.theActorInTheSpotlight().wasAbleTo(AddAdults.addAdults());
            }

            for(int i=0; i<= arg2; i++){
                OnStage.theActorInTheSpotlight().wasAbleTo(AddChildren.addChildren());
            }

            for(int i=0; i<= arg3; i++){
                OnStage.theActorInTheSpotlight().wasAbleTo(AddBabies.addBabies());
            }


    }

    @Then("^he can choose the number of passengers$")
    public void heCanChooseTheNumberOfPassengers() {

    }






}
