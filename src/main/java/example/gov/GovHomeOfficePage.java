package example.gov;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class GovHomeOfficePage extends BasePage {

    private static final String URL = "https://www.gov.uk/government/organisations/home-office";
    private static final PageElement GO_BUTTON = new PageElement(PageElement.Type.CLASS_NAME,
        "submit", "Gov HomeOffice Page: Go Button");
    private static final PageElement SEARCH_INPUT_TEXT = new PageElement(PageElement.Type.ID,
        "site-search-text", "Gov HomeOffice Page: Search Main Text");

    public void setSearchInputText(String value) {
        pilot.sendKeys(SEARCH_INPUT_TEXT, value);
    }

    public GovSearchPage clickGoButton() {
        pilot.click(GO_BUTTON);
        return new GovSearchPage();
    }

    public static GovHomeOfficePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo(URL);
        return new GovHomeOfficePage();
    }

}
