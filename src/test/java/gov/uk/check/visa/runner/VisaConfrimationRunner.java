package gov.uk.check.visa.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "gov/uk/check/visa",

        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class VisaConfrimationRunner {
}
