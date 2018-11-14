package seleniumConfig;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class SeleniumProperties {
    private String driverPath;
    private Long implicitWaitTime;

    public SeleniumProperties(String browser){

        Properties seleniumProperties = new Properties();
        try {
            seleniumProperties.load(new FileReader("C:\\Users\\TECH-W84.LAPTOP-FCCNLJDE\\IdeaProjects\\Cucumber_Introduction\\src\\test\\java\\seleniumConfig\\selenium.properties"));
        } catch(IOException e){
            e.printStackTrace();
        }
        implicitWaitTime = Long.parseLong(seleniumProperties.getProperty("implicitWaitTime"));
        if(browser.equals("chrome")) {
            driverPath = seleniumProperties.getProperty("chromeDriverPath");

        } else if(browser.equals("firefox")){
            driverPath = seleniumProperties.getProperty("firefoxDriverPath");

        } else if(browser.equals("edge")){
            driverPath = seleniumProperties.getProperty("edgeDriverPath");
        }
        System.out.println(seleniumProperties.get("chromeDriverPath"));
    }
    public String getDriverPath() {
        return driverPath;
    }
    public Long getImplicitWaitTime() {
        return implicitWaitTime;
    }
}
