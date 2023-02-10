package co.com.bianfa.prueba.mia.businessstepdefinitions;

import co.com.bianfa.prueba.mia.questions.UnitCreated;
import co.com.bianfa.prueba.mia.tasks.CreatorBusinessUnit;
import co.com.bianfa.prueba.mia.tasks.OpenerBusinessModule;
import co.com.bianfa.prueba.mia.tasks.OpenerSerenity;
import co.com.bianfa.prueba.mia.tasks.SingIn;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BusinessStepDefinitions {

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
    @When("click the organization module")
    public void clickTheOrganizationModule() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenerBusinessModule.openerBusinessModule());
    }
    @When("click in New Business Unit")
    public void clickInNewBusinessUnit() {
        OnStage.theActorInTheSpotlight().attemptsTo(CreatorBusinessUnit.creatorBusinessUnit());
    }
    @Then("The new business unit is created {string}")
    public void theNewBusinessUnitIsCreated(String result) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(UnitCreated.unitCreated(result)));
    }

}