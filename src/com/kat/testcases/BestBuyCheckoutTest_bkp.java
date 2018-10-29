package com.kat.testcases;

import org.openqa.selenium.support.PageFactory;

import com.kat.GenericKeywords.SeleniumRepoClick;
import com.kat.base.InitializeBrowser;
import com.kat.page.BestBuyCheckout;

public class BestBuyCheckoutTest_bkp extends InitializeBrowser{

	
	public static void checkOut() {

		PageFactory.initElements(driver, BestBuyCheckout.class);
		
		/*WebElement ele1 = BestBuyCheckout.getIcn_country_us();
		ele1.click();
		*/
		System.out.println("Best buy Checkout   "+driver);

		System.out.println("   "+BestBuyCheckout.getIcn_country_us());
		SeleniumRepoClick.click(BestBuyCheckout.getIcn_country_us());

		// Click Add to Cart
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_add_to_cart());

	}
}
