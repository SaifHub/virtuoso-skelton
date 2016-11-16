package example.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class HomePage extends BasePage{

    /**
     * Class comment...
     */
    public static HomePage launch(String URL) {
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

        System.out.println("Selenium WebDriver Info");
        System.out.println("Browser Name: " + caps.getBrowserName());
        System.out.println("Browser Version: " + caps.getVersion());
        System.out.println("Browser Platform: " + caps.getPlatform());
        System.out.println("Browser Screen size: " +
                ExecutionContext.getInstance().getPilot().getWebDriver().manage().window().getSize());

        JavascriptExecutor js = (JavascriptExecutor)pilot.getWebDriver();
        String useragent = (String)js.executeScript("return navigator.userAgent;");
        System.out.println("User Agent is "+useragent);


    }
}
