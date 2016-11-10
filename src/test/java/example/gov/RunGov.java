package example.gov;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;


    @RunWith(IntegratedCucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features/gov/gov.feature",
        format = {"pretty", "html:virtuoso-test-results/gov", "json:virtuoso-test-results/gov.json"}
//        glue = "example.gov"
    )

    public class RunGov {
    }
