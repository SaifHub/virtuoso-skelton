package example.amazon;

import org.openqa.selenium.Keys;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

import static java.lang.Thread.sleep;


public class AmazonHomePage extends BasePage {


    private static final PageElement ADD_TO_BASKET = PageElement.byId("add-to-cart-button", "Add to Basket buttton");
    private static final PageElement SEARCH = PageElement.byId("twotabsearchtextbox", "Search field");
    private static final PageElement ORDER_NO_THANKS = PageElement.byId("bb_noThanks_link", "Add to your order no thanks");
    private static final PageElement ORDER_CONTINUE = PageElement.byId("intl_pop_continue", "");
    private static final PageElement BASKET = PageElement.byId("nav-cart", "Basket");
    private static final PageElement SUBTOTAL_PRICE = PageElement.byCssSelector("span.a-size-medium.a-text-bold span span", "Price");
    private static final PageElement SUBTOTAL_ITEM = PageElement.byCssSelector("span.a-size-medium.a-text-bold span", "Item");

    public static AmazonHomePage launch() {
        ExecutionContext.getInstance().getPilot().navigateTo("https://www.amazon.co.uk");
        return new AmazonHomePage();
    }

    public void enterSearch(String search) {
        pilot.waitForElementPresent(SEARCH);
        pilot.sendKeys(SEARCH, search + Keys.RETURN);
    }

    public void clickLinkText(String text) {
        PageElement linkText = PageElement.byLinkText(text, "");
        pilot.clickAndWait(linkText);
    }

    public void clickAddToBasket() {
        pilot.clickAndWait(ADD_TO_BASKET);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("No thanks: " + pilot.elementExists(ORDER_NO_THANKS));
        System.out.println("continue: " + pilot.elementExists(ORDER_CONTINUE));

//        if (pilot.isDisplayed(ORDER_NO_THANKS)) {
//            System.out.println("Order no thanks");
//            pilot.clickAndWait(ORDER_NO_THANKS);
//        }
        if (pilot.elementExists(ORDER_CONTINUE)) {
            System.out.println("Order continue");
            pilot.clickAndWait(ORDER_CONTINUE);
        }
    }

    public void clickBasket() {
        pilot.clickAndWait(BASKET);
    }

    public String returnSubtotalPrice() {
        return pilot.getText(SUBTOTAL_PRICE);
    }

    public String returnSubtotalItems() {
        return pilot.getText(SUBTOTAL_ITEM);
    }
}
