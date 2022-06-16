package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Fill;
import tasks.Login;
import tasks.OpenUp;

public class UtestRegisterStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage( new OnlineCast());
    }
    @Given("^that a user is on the Utest page$")
    public void thatAUserIsOnTheUtestPage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^click on the registration option$")
    public void clickOnTheRegistrationOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage());
    }

    @And("^fill out the form$")
    public void fillOutTheForm() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.onThePage());
        Thread.sleep(10000);
    }

    @Then("^a new user is created$")
    public void aNewUserIsCreated() {
    }
}
