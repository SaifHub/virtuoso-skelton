package example.homeoffice;

/*
* @name : ABDUL SAIF
* @date : 02/12/2016
*/

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/homeoffice/homeoffice.feature"})

public class RunHomeoffice {} // END of RunHomeoffice