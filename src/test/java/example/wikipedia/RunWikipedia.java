package example.wikipedia;

/*
* @name : ABDUL SAIF
* @date : 01/12/2016
*/

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = {"src/test/resources/features/wikipedia/wikipedia.feature"})

    public class RunWikipedia {} // END of RunWikipedia
