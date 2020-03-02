package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import pages.LandingPage;
import pages.LoginChallengePage;

public class LoginSteps extends ScenarioSteps {

    private LandingPage landingPage;
    private LoginChallengePage loginChallenge;

    @Given("I open Landing page")
    @Step
    public LoginSteps openLandingPage (){
        landingPage.open();
        return this;
    }

    @When("I log in with username <user> and password <password>")
    @Step
    public LoginSteps login(@Named("user") String userEmail, @Named("password") String userPassword) {
        landingPage.open();
        landingPage.login(userEmail, userPassword);
        waitABit(600);
        return this;
    }

    @Step
    public LoginSteps validatePageHeader(String expectedMessage) {
        Assert.assertEquals("Wrong header message.", expectedMessage, loginChallenge.getHeaderMessageText());
        return this;
    }
}