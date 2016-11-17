package example.browser;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class HomePage extends BasePage{


    protected static HomePage launch(String URL) {
        ExecutionContext.getInstance().getPilot().navigateTo(URL);
        return new HomePage();
    }
    
    /**
     * Class comment...
     */
    public void screenshot() {
        pilot.getScreenshot();
    }

    /**
     * Class comment...
     */
    public void printCapabilities() {
        Capabilities caps = ((RemoteWebDriver)pilot.getWebDriver()).getCapabilities();

        logger.log(Level.INFO,"Selenium WebDriver Info");
        logger.log(Level.INFO,"Browser Name: " + caps.getBrowserName());
        logger.log(Level.INFO,"Browser Version: " + caps.getVersion());
        logger.log(Level.INFO,"Browser Platform: " + caps.getPlatform());
        logger.log(Level.INFO,"Browser Screen size: " +
                ExecutionContext.getInstance().getPilot().getWebDriver().manage().window().getSize());

        JavascriptExecutor js = (JavascriptExecutor)pilot.getWebDriver();
        String useragent = (String)js.executeScript("return navigator.userAgent;");
        logger.log(Level.INFO,"User Agent is "+useragent);
    }
    
    Logger logger = Logger.getLogger(HomePage.class.getName());
}
