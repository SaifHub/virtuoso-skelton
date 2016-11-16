package example.amazon;

import org.openqa.selenium.Keys;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

class AmazonHomePage extends BasePage {

    private static final PageElement ADD_TO_BASKET = PageElement.byId("add-to-cart-button", "Add to Basket buttton");
    private static final PageElement SEARCH = PageElement.byId("twotabsearchtextbox", "Search field");
    private static final PageElement ORDER_NO_THANKS = PageElement.byId("bb_noThanks_link", "Add to your order no thanks");
    private static final PageElement ORDER_CONTINUE = PageElement.byId("intl_pop_continue", "Add to your order continue");
    private static final PageElement BASKET = PageElement.byId("nav-cart", "Basket");
    private static final PageElement SUBTOTAL_PRICE = PageElement.byCssSelector("span.a-size-medium.a-text-bold span span", "Subtotal Price");
    private static final PageElement SUBTOTAL_ITEM = PageElement.byCssSelector("span.a-size-medium.a-text-bold span", "Subtotal Item");

    private static Logger logger = Logger.getLogger(AmazonHomePage.class.getName());

    /**
     * Navgaites the browser to www.amazon.co.uk
     * @return AmazonHomePage
     */
    static AmazonHomePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo("https://www.amazon.co.uk");
        return new AmazonHomePage();
    }

    /**
     * Enters a search term into the search field and pressed return
     * @param search the search term
     */
    void enterSearch(String search) {
        pilot.waitForElementPresent(SEARCH);
        pilot.sendKeys(SEARCH, search + Keys.RETURN);
    }

    /**
     *
     * @param text the description in the amazon results to click
     */
    void clickLinkText(String text) {
        PageElement linkText = PageElement.byLinkText(text, "Link text " + text);
        pilot.clickAndWait(linkText);
    }

    /**
     * Clicks the add to basket button
     * @throws InterruptedException
     */
    void clickAddToBasket() throws InterruptedException {
        pilot.clickAndWait(ADD_TO_BASKET);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            logger.log(java.util.logging.Level.WARNING, "Sleep Interrupted!", e);
            throw e;
        }

        logger.log(Level.INFO, "No thanks: " + pilot.elementExists(ORDER_NO_THANKS));
        logger.log(Level.INFO, "Continue: " + pilot.elementExists(ORDER_CONTINUE));
        /* Ignore for now!
        if (pilot.isDisplayed(ORDER_NO_THANKS)) {
        pilot.clickAndWait(ORDER_NO_THANKS);
        }
        */
        if (pilot.elementExists(ORDER_CONTINUE)) {
            pilot.clickAndWait(ORDER_CONTINUE);
        }
    }

    /**
     * Clicks the basket button
     */
    void clickBasket() {
        pilot.clickAndWait(BASKET);
    }

    /**
     * @return the subtotal price
     */
    String returnSubtotalPrice() {
        return pilot.getText(SUBTOTAL_PRICE);
    }

    /**
     * @return the number of items
     */
    String returnSubtotalItems() {
        return pilot.getText(SUBTOTAL_ITEM);
    }
}
