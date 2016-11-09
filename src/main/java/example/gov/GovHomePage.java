package example.gov;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class GovHomePage extends BasePage {

    private static final String URL = "https://www.gov.uk";
    private static final PageElement GO_BUTTON = new PageElement(PageElement.Type.CLASS_NAME,
        "submit", "Gov Home Page: Go Button");
    private static final PageElement SEARCH_INPUT_TEXT = new PageElement(PageElement.Type.ID,
        "search-input", "Gov Home Page: Search Input Text");

    public void setSearchInputText(String value) {
        pilot.sendKeys(SEARCH_INPUT_TEXT, value);
    }

    public GovHomeofficePage clickGoButton() {
        pilot.click(GO_BUTTON);
        return new GovHomeofficePage();
    }

    public static GovHomePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo(URL);
        return new GovHomePage();
    }

}
