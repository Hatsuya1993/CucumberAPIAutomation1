package runner;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./features/api/GetRequest.feature",
        glue = "stepdefs/api",
        dryRun = false,
        monochrome = true,
        plugin = {
                "pretty",
                "html:test-output",
        }
)

public class RunAPI {
}