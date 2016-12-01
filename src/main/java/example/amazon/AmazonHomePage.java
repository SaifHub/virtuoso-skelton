package example.amazon;

import org.openqa.selenium.Keys;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * @author : ABDUL SAIF
 * @date   : 10/11/2016
 *
 */

public class AmazonHomePage extends BasePage{

//Attributes
private static final String UrlAdd = "https://www.amazon.co.uk/";
private static final PageElement SEARCH = PageElement.byId("twotabsearchtextbox", "Amazon Home Page: Search Field");
private static final PageElement SORTBY = PageElement.byId("sort", "Amazon Home Page: Relevance");
private static final PageElement CHOOSE = PageElement.byXpath("//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a/h2", "Select First Product");
private static final PageElement BASKET = PageElement.byId("add-to-cart-button", "Add To Basket Button");
private static final PageElement DECLINEADDON = PageElement.byId("intl_pop_continue", "Continue With No Add-On");
private static final PageElement CART = PageElement.byXpath("//*[@id='hlb-next-steps']/a[2]", "Proceed to Cart");
private static final PageElement SIGNIN = PageElement.byId("signInSubmit", "Sign In Page: Select Button");

protected static AmazonHomePage launch()
{
	ExecutionContext.getInstance().getPilot().navigateTo(UrlAdd);
	return new AmazonHomePage();
}

protected void amazonSearch(String search)
{
	pilot.sendKeys(SEARCH, search + Keys.RETURN);
}

protected void sortBy(String sort)
{
	pilot.selectValueFromField(SORTBY, sort);
}

protected String choose()
{
	return pilot.getText(CHOOSE);
}

protected void select()
{
	pilot.click(CHOOSE);
}

protected void basket()
{
	pilot.click(BASKET);
}

protected void declineAddOn()
{
	pilot.click(DECLINEADDON);
}

protected void cart()
{
	pilot.click(CART);
}

protected String signIn()
{
	return pilot.getText(SIGNIN);
}

} //END of AmazonHomePage
