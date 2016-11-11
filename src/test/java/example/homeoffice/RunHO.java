package example.homeoffice;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;


    @RunWith(IntegratedCucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features/HomeOffice/HO.feature",
        format = {"pretty", "html:virtuoso-test-results/HomeOffice", "json:virtuoso-test-results/HomeOffice.json"}
    )

    public class RunHO {
    }
