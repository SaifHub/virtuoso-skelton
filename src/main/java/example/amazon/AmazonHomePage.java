package example.amazon;

import org.openqa.selenium.Keys;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

/**
 * Demo class.
 */

public class AmazonHomePage extends BasePage
{
	  /**
	   * Class comment...
	   */
	private static final PageElement SEARCH = PageElement.byId("twotabsearchtextbox","");
	
	  /**
	   * Class comment...
	   */
	private static final PageElement ITEM = PageElement.byXpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/a/h2","");
	
	  /**
	   * Class comment...
	   */
	private static final PageElement BASKET = PageElement.byId("add-to-cart-button", "");

	  /**
	   * Class comment...
	   */
	public static AmazonHomePage launch()
	{
		ExecutionContext.getInstance().getPilot().navigateTo("https://www.amazon.co.uk/");
		return new AmazonHomePage();
	}

	  /**
	   * Class comment...
	   */
	public void enterSearch(String x)
	{
		pilot.sendKeys(SEARCH, x+Keys.RETURN);
	}

	  /**
	   * Class comment...
	   */
	public void selectItem()
	{
		pilot.click(ITEM);
	}


	public void addItem()
	{
		pilot.click(BASKET);
		
	}
}
