package example.amazon;

import org.openqa.selenium.Keys;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import uk.gov.homeoffice.virtuoso.framework.ExecutionContext;
import uk.gov.homeoffice.virtuoso.framework.element.PageElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
// Test methods for Amazon search
@DefaultUrl("http://www.amazon.co.uk")

public class AmazonHomePage extends PageObject{

	private static final String SEARCH = "#twotabsearchtextbox";
	@FindBy(xpath = "//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/a/h2")
	WebElementFacade Search;
	@FindBy (xpath = "//*[@id=\"oneTimeBuyBox\"]/div/a/i")
	WebElementFacade Checkout;
	private static final String BUTTON2 = "#add-to-cart-button";
	public static AmazonHomePage launch(String URL){

		ExecutionContext.getInstance().getPilot().navigateTo(URL);

		return new AmazonHomePage();

	}

	public void EnterSearch(String a){

		$("#twotabsearchtextbox").type(a).then().sendKeys(Keys.ENTER);

	}

	public void SelectLink(){

		$(Search).click();
	}

	public void OneTimePurchase(){

		$(Checkout).click();
	}

	public void AddToBasket(){

		$(BUTTON2).click();
	}
}