package example.browser;

import org.junit.Test;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;
/**
 * Created by adrian on 03/06/2016.
 */


public class BrowserTest extends SeleniumTest {

    @Test
    public void launchBrowser () {

        printConfigProperties();

        String URL = testData.getInputValue("URL");

        printSeleniumGridInputs();

        System.out.println("Launching browser and navigating to " + URL);
        System.out.println();

        HomePage homePage = HomePage.launch(URL);
        homePage.screenshot();
        homePage.printCapabilities();

    }

    private void printConfigProperties() {
        System.out.println("config.properties");
        System.out.println("WebBrowser: " +
                ExecutionContext.getInstance().getConfigData().getStringProperty("WebBrowser"));
        System.out.println("SeleniumGrid: " +
                ExecutionContext.getInstance().getConfigData().getStringProperty("SeleniumGrid.URL"));
        System.out.println();
    }

    private void printSeleniumGridInputs() {
        System.out.println("Selenium Grid Configuration");
        System.out.println("Configuration.OS: " + testData.getInputValue("Configuration", "OS"));
        System.out.println("Configuration.Browser.Type: " + testData.getInputValue("Configuration", "Browser", "Type"));
        System.out.println("Configuration.Browser.Version: " + testData.getInputValue("Configuration", "Browser", "Version"));
        System.out.println("Configuration.Browser.Width: " + testData.getInputValue("Configuration", "Browser", "Width"));
        System.out.println("Configuration.Browser.Height: " + testData.getInputValue("Configuration", "Browser", "Height"));
        System.out.println();
    }
}
