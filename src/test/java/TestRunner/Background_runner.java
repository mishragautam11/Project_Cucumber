package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "Feature_Background\\Background.feature",
        glue = "StepDefination1",
        plugin = {"json:Reports/newreport.json"}

)

public class Background_runner {

}
