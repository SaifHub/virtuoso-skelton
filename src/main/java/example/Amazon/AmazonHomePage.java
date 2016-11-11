package example.Amazon;

import org.openqa.selenium.Keys;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

public class AmazonHomePage extends BasePage{

	private final static PageElement SEARCH = PageElement.byId("twotabsearchtextbox", "");
	private final static PageElement ITEM = PageElement.byXpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/a/h2", "");
	private final static PageElement BUTTON = PageElement.byXpath("//*[@id=\"oneTimeBuyBox\"]/div/a/i", "");
	private final static PageElement BUTTON2 = PageElement.byId("add-to-cart-button","");
	public static AmazonHomePage launch(String URL){

		ExecutionContext.getInstance().getPilot().navigateTo(URL);

		return new AmazonHomePage();

	}

	public void EnterSearch(String a){

		pilot.sendKeys(SEARCH, a+Keys.RETURN);

	}

	public void SelectLink(){

		pilot.click(ITEM);
	}

	public void OneTimePurchase(){

		pilot.click(BUTTON);
	}

	public void AddToBasket(){

		pilot.click(BUTTON2);
	}
}