package example.serenity;

/*
* @name: ABDUL SAIF
* @date: 24/11/2016
*/

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

//RUNNER file
@CucumberOptions(
        features = "src/test/resources/features/serenity/amazonS.feature"
)

public class RunAmazonS {
    // Empty Constructor
}