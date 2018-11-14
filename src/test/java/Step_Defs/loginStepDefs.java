package Step_Defs;

import bbcSite.BbcSite;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import seleniumConfig.SeleniumDriverConfig;

public class loginStepDefs {
    private SeleniumDriverConfig config = new SeleniumDriverConfig("chrome");
    private BbcSite site = new BbcSite(config.getDriver());

    @Given("^I am able to access the sign in page$")
    public void i_am_able_to_access_the_sign_in_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        site.logInPage.goToSignInPage();
        Assert.assertEquals(site.logInPage.getSignInPageURL(), site.getURL());
    }

    @When("^I use incorrect credentials to log in$")
    public void i_use_incorrect_credentials_to_log_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions    throw new PendingException();
        site.logInPage.goToSignInPage();
        site.logInPage.enterUsername("hello123@gmail.com");
        site.logInPage.enterPassword("password");
        site.logInPage.pressSubmit();
    }

    @Then("^I receive a viable error$")
    public void i_receive_a_viable_error() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertNotEquals(null, site.logInPage.getPasswordErrorText());
    }
}
