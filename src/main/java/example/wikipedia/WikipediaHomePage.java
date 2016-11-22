package example.wikipedia;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class WikipediaHomePage extends BasePage {

    private static final String URL = "http://www.wikipedia.org/";
    private static final PageElement GO_BUTTON = new PageElement(PageElement.Type.CLASS_NAME,
        "pure-button", "Wikipedia Home Page: Go Button");
    private static final PageElement SEARCH_INPUT_TEXT = new PageElement(PageElement.Type.ID,
        "searchInput", "Wikipedia Home Page: Search Input Text");

    /**
     * Enters a search term into the search field
     * @param value search term
     */
    public void setSearchInputText(String value) {
        pilot.sendKeys(SEARCH_INPUT_TEXT, value);
    }

    /**
     * Click the 'Go' Button
     * @return WikipediaComputingPage
     */
    public WikipediaComputingPage clickGoButton() {
        pilot.click(GO_BUTTON);
        return new WikipediaComputingPage();
    }

    /**
     * Navigates to the URL
     * @return WikipeidaHomePage
     */
    public static WikipediaHomePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo(URL);
        return new WikipediaHomePage();
    }

}
