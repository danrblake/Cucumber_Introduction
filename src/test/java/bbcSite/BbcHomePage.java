package bbcSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomePage {
    private WebDriver driver;

    private String homepageURL = "https://www.bbc.co.uk";
    private By signInLinkID = By.id("idcta-link");

    public BbcHomePage(WebDriver driver){
        this.driver = driver;
    }
    public void getURL(){
        driver.getCurrentUrl();
    }
    public void goToHomepage(){
        driver.navigate().to(homepageURL);
    }

}
