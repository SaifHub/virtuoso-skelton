package example.amazon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/amazon/amazon.feature")

public class RunAmazon{



}