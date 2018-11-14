package seleniumConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class SeleniumDriverConfig {
    private WebDriver driver;
    private SeleniumProperties properties;

    public SeleniumDriverConfig(String browser) {
        properties = new SeleniumProperties(browser);
        Long waitTime = properties.getImplicitWaitTime();

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",properties.getDriverPath());
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.driver",properties.getDriverPath());
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",properties.getDriverPath());
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }
    public WebDriver getDriver() {
        return driver;
    }
    public SeleniumProperties getProperties() {
        return properties;
    }
}
