//package example.serenity;
//
//import net.serenitybdd.core.annotations.findby.FindBy;
//import net.serenitybdd.core.pages.PageObject;
//import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.annotations.DefaultUrl;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@DefaultUrl("http://amazon.co.uk")
//
//public class HomePageS extends PageObject {
//
//    //ATTRIBUTES
//    @FindBy(xpath="//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/a/h2")
//    WebElementFacade SELECTITEM;
//
//    String BASKET = "#add-to-cart-button";
//
//    @FindBy(xpath="//*[@id=\"intl_pop_continue\"]")
//    WebElementFacade DECLINE;
//
//    @FindBy(xpath="//*[@id='hlb-next-steps']/a")
//    WebElementFacade CART;
//
//    @FindBy(xpath="//*[@id='sc-buy-box-ptc-button']/span/input")
//    WebElementFacade CHECKOUT;
//
//    String SIGNINSUBMIT = "#signInSubmit";
//
//
//    //SEARCH for input
//    public void search(String actionName)
//    {
//        $("#twotabsearchtextbox").type(actionName).then().sendKeys(Keys.ENTER);
//    }
//
//    //public void sort(String actionName)
//    //{
//    //  $("#sort").type(actionName).then().sendKeys(Keys.ENTER);
//    //}
//
//    //SELECT and ENTER first item on page
//    public void selectItem()
//    {
//        $(SELECTITEM).click();
//    }
//
//    //ADD selected item into basket
//    public void basket()
//    {
//        $(BASKET).sendKeys(Keys.ENTER);
//    }
//
//    //SELECT and SUBMIT decline addon
//    public void declineAddOn()
//    {
//        $(DECLINE).click();
//    }
//
//    //SELECT the cart
//    public void cart()
//    {
//        $(CART).click();
//    }
//
//    //SELECT the checkout
//    public void checkout()
//    {
//        $(CHECKOUT).click();
//    }
//
//    //CHECK the signin page
//    public void signIn()
//    {
//        String SIGNIN = $(SIGNINSUBMIT).getText();
//        System.out.println("Successfully ran Amazon: "+SIGNIN);
//    }
//
//} // END of search class