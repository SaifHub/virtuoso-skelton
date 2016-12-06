package example.belly;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;

    @RunWith(IntegratedCucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features/belly/belly.feature",
        format = {"pretty", "html:virtuoso-test-results/belly", "json:virtuoso-test-results/belly.json"}
        , tags = {"@growl, @silent"}
    )

    public class RunBelly {
    }
