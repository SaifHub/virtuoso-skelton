package example.ebay;

import org.openqa.selenium.Keys;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.ebay.co.uk/")

public class EbayHomePage extends PageObject
{

	public void search(String arg1)
	{
		$("#gh-ac").type(arg1).then().sendKeys(Keys.ENTER);
		
	}

	public void auction()
	{
		$("//*[@id=\"cbelm\"]/div[1]/div[2]/a[1]").click();
	}

	public void time()
	{
		$("//*[@id=\"DashSortByContainer\"]/ul[1]/li/a").click();
		$("//*[@id=\"SortMenu\"]/li[6]/a").click();
	}

	public void select()
	{
		$("//*[@id=\"item3f7067a3ff\"]/h3/a").click();	
	}

	public void compare(String arg2)
	{
		String x = $("//*[@id=\"prcIsum_bidPrice\"]").getValue();
		double d = Double.parseDouble(x);
		double e = Double.parseDouble(arg2);
		if (d <= e)
		{
			$("MaxBidId").type(arg2).then().sendKeys(Keys.ENTER);
		}
		else
		{
			
		}
	}

	public void uK()
	{
		$("//*[@id=\"e1-31\"]").click();		
	}



}
