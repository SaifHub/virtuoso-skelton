package example.wikipedia;

/**
 * @author : ABDUL SAIF
 * @date   : 10/11/2016
 *
 */

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

public class WikipediaHomePage extends BasePage {

    private static final String URL = "http://www.wikipedia.org/";
    private static final PageElement GO_BUTTON = new PageElement(PageElement.Type.CLASS_NAME,
        "pure-button", "Wikipedia Home Page: Go Button");
    private static final PageElement SEARCH_INPUT_TEXT = new PageElement(PageElement.Type.ID,
        "searchInput", "Wikipedia Home Page: Search Input Text");

    protected void setSearchInputText(String value) {
        pilot.sendKeys(SEARCH_INPUT_TEXT, value);
    }

    protected WikipediaComputingPage clickGoButton() {
        pilot.click(GO_BUTTON);
        return new WikipediaComputingPage();
    }

    protected static WikipediaHomePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo(URL);
        return new WikipediaHomePage();
    }

}
