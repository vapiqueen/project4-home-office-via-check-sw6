package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfrimationSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I  select reason {string}")
    public void iSelectReason(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I will click on continue button again")
    public void iWillClickOnContinueButtonAgain() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @Then("I should be able to see the result You will not need a visa to come to the UK")
    public void iShouldBeAbleToSeeTheResultYouWillNotNeedAVisaToComeToTheUK() throws InterruptedException {
        Assert.assertEquals(new ResultPage().getResultMessageTourism(),"You will not need a visa to come to the UK","Unable to verify message");
    }

    @And("I select the intendent to stay for {string}")
    public void iSelectTheIntendentToStayFor(String moreOrLess) {
        new DurationOfStayPage().selectLengthOfStay(moreOrLess);

    }

    @And("I select having  plannning to work for {string}")
    public void iSelectHavingPlannningToWorkFor(String workType) {
        new WorkTypePage().selectPlanningToWorkType(workType);
    }

    @Then("I should be able to see the result You need a visa to work in health and care")
    public void iShouldBeAbleToSeeTheResultYouNeedAVisaToWorkInHealthAndCare() {
        Assert.assertEquals(new ResultPage().getResultMessageHealthCare(),"You need a visa to work in health and care","Unable to verify message");
    }

    @Then("I should be able to see the result You'll need a visa to join your family or partner in the UK")
    public void iShouldBeAbleToSeeTheResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        Assert.assertEquals(new ResultPage().getResultMessageFamily(),"You may need a visa","Unable to verify message");
    }
}
