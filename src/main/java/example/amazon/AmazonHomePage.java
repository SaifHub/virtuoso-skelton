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
private static final String URL = "https://www.amazon.co.uk/"; 														 //SET URL
private static final PageElement SEARCH = PageElement.byId("twotabsearchtextbox", "Amazon Home Page: Search Field"); //SET Search field via inspection
private static final PageElement SORTBY = PageElement.byId("sort", "Amazon Home Page: Sort Drop Down");
private static final PageElement CHECK = PageElement.byXpath("//*[@id='result_6']/div/div/div/div[2]/div[2]/a/h2", "Amazon Check Page: Check Featured");
private static final PageElement TB = PageElement.byId("a-autoid-10-announce", "Amazon Select 1TB");
private static final PageElement BASKET = PageElement.byId("add-to-cart-button", "Amazon Basket Button");	
private static final PageElement CHECKOUT = PageElement.byId("hlb-ptc-btn", "Amazon Checkout Button");
private static final PageElement NOTHANKS = PageElement.byId("siNoCoverage", "Amazon No Thanks Button");
private static final PageElement SIGNIN = PageElement.byXpath("//*[@id='a-page']/div[1]/div[3]/div/div/form/div/div/div/h1", "Amazon No Thanks Button");

public static AmazonHomePage launch()
{
	ExecutionContext.getInstance().getPilot().navigateTo(URL);
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

protected String check()
{
	return pilot.getText(CHECK);
}

protected void select()
{
	pilot.click(CHECK);
}

protected void tb()
{
	pilot.click(TB);
}

protected void basket()
{
	pilot.click(BASKET);
}

protected void checkOut()
{
	pilot.click(CHECKOUT);
}

protected void noThanks()
{
	pilot.click(NOTHANKS);
}

protected String signIn()
{
	return pilot.getText(SIGNIN);
}

} //END of AmazonHomePage
