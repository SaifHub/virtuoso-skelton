package example.belly;

/**
 * @author : ABDUL SAIF
 * @date   : 24/11/2016
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;

    @RunWith(IntegratedCucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features/belly/belly.feature",
        format = {"pretty", "html:virtuoso-test-results/belly", "json:virtuoso-test-results/belly.json"}
        , tags = {"@growl, @silent"})

    public class RunBelly {} // END of RunBelly
