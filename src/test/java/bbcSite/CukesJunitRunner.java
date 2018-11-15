package bbcSite;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty"},
        features = {"C:\\Users\\TECH-W84.LAPTOP-FCCNLJDE\\IdeaProjects\\Cucumber_Introduction\\src\\test\\resources\\Features\\login.feature"},
        glue = {"Step_Defs"},
        tags = {"@FunctionalTest"}
)
public class CukesJunitRunner {

}
