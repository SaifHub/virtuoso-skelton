package example.resttesting;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;

@RunWith(IntegratedCucumber.class)
@CucumberOptions(features = "src/main/java/RESTTesting/webversion.feature",
format = {"pretty", "html:virtuoso-test-results/resttesting", "json:virtuoso-test-results/resttesting.json"}
)


public class RunRESTtesting {

}
