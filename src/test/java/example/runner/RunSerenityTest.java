package example.runner;

/**
 * @author : ABDUL SAIF
 * @date   : 06/12/2016
 */

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        //RESPONSIBLE for displaying coloured steps in console, useful to see step failures (CAN BE REMOVED FOR CLEANER CONSOLE)
        format = {"pretty"},
        //RUNS features with 'virtuoso' tag
        tags = "@virtuoso",
        glue = {"example.belly", "example.homeoffice", "example.REST", "example.serenity", "example.wikipedia"})

public class RunSerenityTest {} // END of RunSerenityTest