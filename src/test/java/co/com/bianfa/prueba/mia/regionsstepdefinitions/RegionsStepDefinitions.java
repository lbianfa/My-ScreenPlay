package co.com.bianfa.prueba.mia.regionsstepdefinitions;

import co.com.bianfa.prueba.mia.questions.RegionCreated;
import co.com.bianfa.prueba.mia.tasks.CreatorRegion;
import co.com.bianfa.prueba.mia.tasks.OpenerRegionsModule;
import co.com.bianfa.prueba.mia.tasks.OpenerSerenity;
import co.com.bianfa.prueba.mia.tasks.SingIn;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegionsStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("I'am in the serenity site")
    public void iAmInTheSerenitySite() {
        OnStage.theActorCalled("Tester007").wasAbleTo(OpenerSerenity.openerSerenity());
    }
    @Given("log in with my credentials")
    public void logInWithMyCredentials() {
        OnStage.theActorCalled("Tester007").wasAbleTo(SingIn.singIn());
    }
    @When("click the Regions")
    public void clickTheRegions() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenerRegionsModule.openerRegionsModule());
    }
    @When("Fill the form")
    public void fillTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(CreatorRegion.creatorRegion());
    }
    @Then("The new Region is created {string}")
    public void theNewRegionIsCreated(String result) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegionCreated.regionCreated(result)));
    }
}
