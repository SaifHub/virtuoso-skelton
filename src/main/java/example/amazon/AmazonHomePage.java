package example.amazon;

import org.openqa.selenium.Keys;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * @author ABDUL SAIF
 * Created - 10/11/2016
 *
 */


public class AmazonHomePage extends BasePage{
	
//Attributes
private static final String urlAdd = "https://www.amazon.co.uk/"; 														 
private static final PageElement SEARCH = PageElement.byId("twotabsearchtextbox", "Amazon Home Page: Search Field"); 
private static final PageElement SORTBY = PageElement.byId("sort", "Amazon Home Page: Relevance");
private static final PageElement CHOOSE = PageElement.byXpath("//*[@id='result_0']/div/div/div/div[2]/div[2]/a/h2", "Amazon Check Page: Check Relevance");
private static final PageElement BASKET = PageElement.byId("add-to-cart-button", "Add To Basket Button");
private static final PageElement CONTINUE = PageElement.byId("intl_pop_continue", "Continue With No Add-On");
private static final PageElement CHECKOUT = PageElement.byXpath("//*[@id='hlb-next-steps']/a", "Checkout Basket");
private static final PageElement SIGNIN = PageElement.byId("signInSubmit", "Sign In Page: Select Button");

public static AmazonHomePage launch()
{
	ExecutionContext.getInstance().getPilot().navigateTo(urlAdd);
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

protected void decline()
{
	pilot.click(CONTINUE);
}

protected void checkOut()
{
	pilot.click(CHECKOUT);
}

protected String signIn()
{
	return pilot.getText(SIGNIN);
}

} //END of AmazonHomePage
