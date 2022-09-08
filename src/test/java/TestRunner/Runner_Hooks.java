package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:\\Users\\Dell\\Desktop\\IdeaProjects\\My_Cucumber\\Feature_hooks\\Hooks.feature",
        glue = "StepDefination1"

)

public class Runner_Hooks {
}
