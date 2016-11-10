package example.gov;

import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class GovSearchPage extends BasePage {

    private static final PageElement FIRST_HEADING = new PageElement(PageElement.Type.XPATH,
        "//h1[@id='firstHeading']", "Gov Search Page: First Heading");

    public String getFirstHeading() {
        return pilot.getText(FIRST_HEADING);
    }
}
