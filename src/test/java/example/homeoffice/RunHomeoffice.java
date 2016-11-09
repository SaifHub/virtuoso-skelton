package example.homeoffice;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;


    @RunWith(IntegratedCucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features/homeoffice/homeoffice.feature",
        format = {"pretty", "html:virtuoso-test-results/homeoffice", "json:virtuoso-test-results/homeoffice.json"}
    )

    public class RunHomeoffice {
    }
