package example.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by SaifAbdulMacbook on 24/11/2016.
 */

@RunWith(CucumberWithSerenity.class)

//RUNNER file
@CucumberOptions(
        features = "src/test/resources/features/manage_todos/record_todos/amazon.feature"
)

public class RunAmazonS {
}
