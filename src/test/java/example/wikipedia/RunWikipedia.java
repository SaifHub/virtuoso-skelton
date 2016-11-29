package example.wikipedia;

/*
* @name : ABDUL SAIF
* @date : 24/11/2016
*/

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/wikipedia/wikipedia.feature",
            format = {"pretty", "html:virtuoso-test-results/wikipedia", "json:virtuoso-test-results/wikipedia.json"}
                    , tags = {"@virtuoso"})

    public class RunWikipedia {} // END of RunWikipedia
