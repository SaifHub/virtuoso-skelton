package example.homeoffice;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class HOHomePage extends BasePage {

    private static final String URL = "http://www.homeoffice.gov.uk/";
    private static final PageElement GO_BUTTON = new PageElement(PageElement.Type.CLASS_NAME,
        "submit", "Home Office Home Page: Go Button");
    private static final PageElement SEARCH_INPUT_TEXT = new PageElement(PageElement.Type.ID,
        "site-search-text", "Home Office Home Page: Search Input Text");

    public void setSearchInputText(String value) {
        pilot.sendKeys(SEARCH_INPUT_TEXT, value);
    }

    public HOComputingPage clickGoButton() {
        pilot.click(GO_BUTTON);
        return new HOComputingPage();
    }

    public static HOHomePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo(URL);
        return new HOHomePage();
    }

}
