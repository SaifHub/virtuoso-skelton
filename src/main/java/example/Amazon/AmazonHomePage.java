package example.Amazon;

import org.openqa.selenium.Keys;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

public class AmazonHomePage extends BasePage
{
	// Attributes
	private static final PageElement SEARCH = PageElement.byId("twotabsearchtextbox","");
	private static final PageElement ITEM = PageElement.byXpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/a/h2","");
	private static final PageElement BASKET = PageElement.byId("add-to-cart-button", "");
	
	public static AmazonHomePage launch()
	{
		ExecutionContext.getInstance().getPilot().navigateTo("https://www.amazon.co.uk/");
		return new AmazonHomePage();
	}
	
	
	// Constructors


	// Methods
	
	public void EnterSearch(String x)
	{
		pilot.sendKeys(SEARCH, x+Keys.RETURN);
	}


	public void SelectItem()
	{
		pilot.click(ITEM);
	}


	public void AddItem()
	{
		pilot.click(BASKET);
		
	}
}
