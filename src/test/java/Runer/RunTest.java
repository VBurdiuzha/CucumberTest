package Runer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports", "html:target/site/cucumber-pretty"},
        tags = {"@CreditCard", "@Login"},
        features = {"src/test/java/Features"},
        glue = {"classpath:Glue"}
)

public class RunTest {
}
