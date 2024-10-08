package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
                features = "src/test/java/FeaturesFiles",
                glue = "StepDefinations",
                monochrome = true,
                dryRun = false

        )
public class TestNGRunner extends AbstractTestNGCucumberTests {




}


