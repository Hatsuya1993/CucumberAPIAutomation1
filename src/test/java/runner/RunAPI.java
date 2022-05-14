package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/api",
        glue = "stepdefs.api",
        plugin = {
                "pretty",
                "html:target/html/",
                "json:target/json/file.json"
        }
)

public class RunAPI {
}
