package example.homeoffice;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class HomeofficeHomePage extends BasePage {

    private static final String URL = "https://www.gov.uk/government/organisations/home-office";
    private static final PageElement GO_BUTTON = new PageElement(PageElement.Type.CLASS_NAME,
        "pure-button", "Homeoffice Home Page: Go Button");
    private static final PageElement SEARCH_INPUT_TEXT = new PageElement(PageElement.Type.ID,
        "searchInput", "Homeoffice Home Page: Search Input Text");

    public void setSearchInputText(String value) {
        pilot.sendKeys(SEARCH_INPUT_TEXT, value);
    }

    public HomeofficeComputingPage clickGoButton() {
        pilot.click(GO_BUTTON);
        return new HomeofficeComputingPage();
    }

    public static HomeofficeHomePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo(URL);
        return new HomeofficeHomePage();
    }

}
