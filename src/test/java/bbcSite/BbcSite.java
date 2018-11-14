package bbcSite;
import org.openqa.selenium.WebDriver;
public class BbcSite {

    private WebDriver driver;
    public BbcLogInPage logInPage;
    public BbcHomePage homePage;

    public BbcHomePage homePage(){
        return new BbcHomePage(driver);
    }
    public BbcSite(WebDriver driver){
        this.driver = driver;
        this.logInPage = new BbcLogInPage(driver);
        this.homePage = new BbcHomePage(driver);
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
    public void close(){
        driver.close();
    }
}
