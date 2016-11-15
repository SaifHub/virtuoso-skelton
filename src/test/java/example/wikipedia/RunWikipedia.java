package example.wikipedia;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;


    @RunWith(IntegratedCucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features/wikipedia/wikipedia.feature",
        plugin = {
                "pretty",
                "html:virtuoso-test-results/wikipedia",
                "json:virtuoso-test-results/wikipedia.json"
        },
        monochrome = false
    )

    public class RunWikipedia {
    }
