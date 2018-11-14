package bbcSite;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class BbcLogInPage {

    private WebDriver driver;
    private String signInPageURL = "https://account.bbc.com/signin";
    private By usernameField = By.id("user-identifier-input");
    private By passwordField = By.id("password-input");
    private By submitButton = By.id("submit-button");
    private By incorrectPasswordErrorID = By.id("form-message-password");

    public BbcLogInPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate().to(signInPageURL);
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void pressSubmit(){
        driver.findElement(submitButton).click();
    }

    public String getPasswordErrorText(){
        return driver.findElement(incorrectPasswordErrorID).getText();
    }

    //page assertion

    public void assertCurrentURLIsSignInPage(){
        Assert.assertEquals(driver.getCurrentUrl(), signInPageURL);
    }
    public String getCurrentURL(){
        return signInPageURL;
    }
    public String getSignInPageURL(){
        return signInPageURL;
    }
}
