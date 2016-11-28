package example.amazon;

/*
* @name : ABDUL SAIF
* @date : 24/11/2016
*/

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

	@RunWith(CucumberWithSerenity.class)

	@CucumberOptions
	(features = "src/test/resources/features/amazon/amazon.feature", 
	format = {"pretty", "html:virtuoso-test-results/amazon", "json:virtuoso-test-results/amazon.json"})

	public class RunAmazon {} // END of RunAmazon
