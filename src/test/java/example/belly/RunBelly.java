package example.belly;

/**
 * @author : ABDUL SAIF
 * @date   : 06/12/2016
 */

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
        features = "src/test/resources/features/belly/belly.feature",
        format = {"pretty", "html:virtuoso-test-results/belly", "json:virtuoso-test-results/belly.json"}
        , tags = {"@growl, @silent"})

    public class RunBelly {} // END of RunBelly
