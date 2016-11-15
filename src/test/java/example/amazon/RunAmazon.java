package example.amazon;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;

/**
 * Created by adrian on 10/11/16.
 */

    @RunWith(IntegratedCucumber.class)
    @CucumberOptions (
            features = "src/test/resources/features/amazon",
            plugin = {
                    "pretty",
                    "json:virtuoso-test-results/amazon.json"
            }
    )

public class RunAmazon {
}
