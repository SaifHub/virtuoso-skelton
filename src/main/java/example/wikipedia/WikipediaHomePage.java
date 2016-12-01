package example.wikipedia;

/**
 * @author : ABDUL SAIF
 * @date   : 10/11/2016
 */

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

//SPECIFY and INITIALISE URL address
@DefaultUrl("https://www.wikipedia.org/")

public class WikipediaHomePage extends PageObject {

    //ATTRIBUTES by ID
    String CHECK = "#firstHeading";

    //METHODS
    //1. SEARCH for input
    public void search(String actionName)
    {
        $("#searchInput").type(actionName).then().sendKeys(Keys.ENTER);
    }

    //2. CHECK the page has loaded correctly
    public void checkPage()
    {
        String CHECKED = $(CHECK).getText();
        System.out.println("Successfully ran Wikipedia: "+CHECKED);
    }

}
