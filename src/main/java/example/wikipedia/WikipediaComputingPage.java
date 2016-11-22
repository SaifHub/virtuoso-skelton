package example.wikipedia;

import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */
public class WikipediaComputingPage extends BasePage {

    private static final PageElement FIRST_HEADING = new PageElement(PageElement.Type.XPATH,
        "//h1[@id='firstHeading']", "Wikipedia Computing Page: First Heading");

    /**
     * Returns the first heading from Wikipedia Page
     * @return
     */
    public String getFirstHeading() {
        return pilot.getText(FIRST_HEADING);
    }
}
