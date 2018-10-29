package com.kat.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BestBuyTrackOrder {

	// Track Order
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//a[@href='https://www.bestbuy.com/identity/global/signin']/button")
	 * private static WebElement btn_signIn;
	 * 
	 * @FindBy(how = How.XPATH, using = "//button[@type='submit']/span") private
	 * static WebElement btn_signin_account;
	 */

	@FindBy(how = How.ID, using = "hf_accountMenuLink")
	private static WebElement lnk_account;

	@FindBy(how = How.XPATH, using = "https://www.bestbuy.com/profile/ss/guestorderlookup")
	private static WebElement lnk_track_order;

	@FindBy(how = How.XPATH, using = "//input[@id='orderNumber-id']")
	private static WebElement txt_order_number;

	@FindBy(how = How.XPATH, using = "//input[@id='lastName-id']")
	private static WebElement txt_order_tracking_last_name;

	@FindBy(how = How.XPATH, using = "//input[@id='phoneNumber-id']")
	private static WebElement txt_order_phone_number;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Find') and @type='submit']")
	private static WebElement btn_find_order;
	

	@FindBy(how = How.XPATH, using = "//div/h3/span[contains(@class,'order-status-text')]")
	private static WebElement ro_txt_order_status;

	@FindBy(how = How.XPATH, using = "//div/h3/span[contains(text(),'BBY01')]")
	private static WebElement ro_txt_order_number;

	
	
	
	
	
	
	public static WebElement getBtn_find_order() {
		return btn_find_order;
	}

	public static void setBtn_find_order(WebElement btn_find_order) {
		BestBuyTrackOrder.btn_find_order = btn_find_order;
	}

	public static WebElement getLnk_account() {
		return lnk_account;
	}

	public static void setLnk_account(WebElement lnk_account) {
		BestBuyTrackOrder.lnk_account = lnk_account;
	}

	public static WebElement getRo_txt_order_status() {
		return ro_txt_order_status;
	}

	public static void setRo_txt_order_status(WebElement ro_txt_order_status) {
		BestBuyTrackOrder.ro_txt_order_status = ro_txt_order_status;
	}

	public static WebElement getRo_txt_order_number() {
		return ro_txt_order_number;
	}

	public static void setRo_txt_order_number(WebElement ro_txt_order_number) {
		BestBuyTrackOrder.ro_txt_order_number = ro_txt_order_number;
	}


	public static WebElement getLnk_track_order() {
		return lnk_track_order;
	}

	public static void setLnk_track_order(WebElement lnk_track_order) {
		BestBuyTrackOrder.lnk_track_order = lnk_track_order;
	}

	public static WebElement getTxt_order_number() {
		return txt_order_number;
	}

	public static void setTxt_order_number(WebElement txt_order_number) {
		BestBuyTrackOrder.txt_order_number = txt_order_number;
	}

	public static WebElement getTxt_order_tracking_last_name() {
		return txt_order_tracking_last_name;
	}

	public static void setTxt_order_tracking_last_name(WebElement txt_order_tracking_last_name) {
		BestBuyTrackOrder.txt_order_tracking_last_name = txt_order_tracking_last_name;
	}

	public static WebElement getTxt_order_phone_number() {
		return txt_order_phone_number;
	}

	public static void setTxt_order_phone_number(WebElement txt_order_phone_number) {
		BestBuyTrackOrder.txt_order_phone_number = txt_order_phone_number;
	}

}
