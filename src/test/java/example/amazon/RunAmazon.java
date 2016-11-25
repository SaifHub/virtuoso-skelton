package example.amazon;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;

@RunWith(IntegratedCucumber.class)

@CucumberOptions
	(features = "src/test/resources/features/amazon/amazon.feature", 
	format = {"pretty", "html:virtuoso-test-results/amazon", "json:virtuoso-test-results/amazon.json"})

public class RunAmazon {
	//Empty Constructor
}
