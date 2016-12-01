package amazon;

import org.openqa.selenium.Keys;

import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import uk.gov.homeoffice.virtuoso.framework.page.BasePage;

public class AmazonHomePage extends BasePage{

	private static final PageElement SEARCH=PageElement.byId("twotabsearchtextbox", "");
	public static final PageElement ITEM=PageElement.byXpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/div[1]/a/h2", "");
	public static final PageElement REVIEW=PageElement.byXpath("//*[@id=\"acrCustomerReviewText\"]", "");
	//public static final 
	public static final PageElement BASKET=PageElement.byXpath("//*[@id=\"add-to-cart-button\"]", "");
	//public static final PageElement BASKET=PageElement.byClassName("a-button-input", "");

	//*[@id="result_0"]/div/div[3]/div/a, ("//*[@id=\"result_0\"]/div/div[3]/div/a/h2", ""),//*[@id="result_0"]/div/div[3]/div/a/h2, a-size-medium a-color-null s-inline s-access-title a-text-normal
	
	public static AmazonHomePage launch() {

		ExecutionContext.getInstance().getPilot().navigateTo("https://www.amazon.co.uk/");
		return new AmazonHomePage();

	}

	public void AmazonSearch(String a){
		
		pilot.sendKeys(SEARCH, a+Keys.RETURN);
		
	}
	public void AmazonResult(){
		
		pilot.click(ITEM);
		
	}

	public void AmazonReview() {

		pilot.click(REVIEW);

	}
	public void AmazonHome(){
		pilot.sendKeys(Keys.HOME);
	}
	public void AmazonBasket() {

		pilot.click(BASKET);

	}
	

}
