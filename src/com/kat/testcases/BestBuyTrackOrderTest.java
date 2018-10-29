package com.kat.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.kat.GenericKeywords.SeleniumRepoClick;
import com.kat.GenericKeywords.SeleniumRepoSendKey;
import com.kat.base.InitializeBrowser;
import com.kat.page.BestBuyCheckout;
import com.kat.page.BestBuyTrackOrder;

public class BestBuyTrackOrderTest extends InitializeBrowser{

	static Logger logger = Logger.getLogger(BestBuyTrackOrderTest.class);

	public static void main(String[] args) {
		trackByOrderNumber();
	}
	
	public static void trackByOrderNumber(){
		//PageFactory.initElements(driver, BestBuyTrackOrder.class);
		PageFactory.initElements(driver, BestBuyCheckout.class);
		
		InitializeBrowser.InvokeBrowser();
		logger.info("Chrome Incongnito browser has open");
		
		driver.get("https://www.bestbuy.com");
		logger.info("Navigate to bestbuy.com for order tracking");
		
		System.out.println("BestBuyCheckout.getIcn_country_us()    "+BestBuyCheckout.getIcn_country_us());
		
		SeleniumRepoClick.click(BestBuyCheckout.getIcn_country_us());
		
		
		System.out.println("BestBuyTrackOrder.getLnk_account()    "+BestBuyTrackOrder.getLnk_account());
		SeleniumRepoClick.click(BestBuyTrackOrder.getLnk_account());
		
		
		
		SeleniumRepoClick.click(BestBuyTrackOrder.getLnk_track_order());
		
		SeleniumRepoSendKey.sendKeys(BestBuyTrackOrder.getTxt_order_number(), "BBY01-805573690448");
		
		SeleniumRepoSendKey.sendKeys(BestBuyTrackOrder.getTxt_order_tracking_last_name(), "Choudhary");
		
		SeleniumRepoSendKey.sendKeys(BestBuyTrackOrder.getTxt_order_phone_number(), "7045198973");
		
		SeleniumRepoClick.click(BestBuyTrackOrder.getBtn_find_order());
		
		System.out.println(BestBuyTrackOrder.getRo_txt_order_status().getText());
		
		
	}
	
}
