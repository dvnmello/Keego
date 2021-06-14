package keego;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/java/",glue = { "" }, monochrome = true, dryRun = false, 
plugin = {"pretty", "html:target/Destination"})


public class LoginTest {
}
