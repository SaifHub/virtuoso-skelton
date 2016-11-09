package example.homeOffice;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;


    @RunWith(IntegratedCucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features/homeOffice/homeOffice.feature",
        format = {"pretty", 
        		"html:virtuoso-test-results/homeOffice", 
        		"json:virtuoso-test-results/homeOffice.json"
        		},
        monochrome = false
    )

    public class RunHomeOffice {
    }
