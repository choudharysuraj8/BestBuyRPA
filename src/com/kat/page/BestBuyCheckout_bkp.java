package com.kat.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BestBuyCheckout_bkp {

	@FindBy(how = How.XPATH, using = "//a[@class='us-link']")
	private static WebElement icn_country_us;

	@FindBy(how = How.ID, using = "hf_accountMenuLink")
	private static WebElement lnk_account;

	@FindBy(how = How.XPATH, using = "//a[@href='https://www.bestbuy.com/identity/global/signin/button']")
	private static WebElement btn_home_page_sign_in;

	@FindBy(how = How.ID, using = "fld-e")
	private static WebElement txt_email;

	@FindBy(how = How.ID, using = "fld-p1")
	private static WebElement txt_password;

	@FindBy(how = How.XPATH, using = "//button[@class='cia-form__submit-button js-submit-button']")
	private static WebElement btn_sign_in;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block button-state-default btn-primary btn-leading-ficon']")
	private static WebElement btn_add_to_cart;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block btn-primary']")
	private static WebElement btn_checkout;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block btn-primary']")
	private static WebElement btn_payment;

	@FindBy(how = How.XPATH, using = "//input[@id='consolidatedAddresses.ui_address_2.firstName']")
	private static WebElement txt_first_name;

	@FindBy(how = How.XPATH, using = "//input[@id=’ consolidatedAddresses.ui_address_2.lastName’]")
	private static WebElement txt_last_name;

	@FindBy(how = How.XPATH, using = "//input[@id=’ consolidatedAddresses.ui_address_2.street’]")
	private static WebElement txt_address;

	@FindBy(how = How.XPATH, using = "//input[@id=’ consolidatedAddresses.ui_address_2.city’]")
	private static WebElement txt_city;

	@FindBy(how = How.XPATH, using = "//select[@id=’ consolidatedAddresses.ui_address_2.state’]")
	private static WebElement txt_state;

	@FindBy(how = How.XPATH, using = "//select[@id=’ consolidatedAddresses.ui_address_2.state’]")
	private static WebElement txt_zip_code;

	public static WebElement getIcn_country_us() {
		return icn_country_us;
	}

	public static WebElement getLnk_account() {
		return lnk_account;
	}

	public static WebElement getBtn_home_page_sign_in() {
		return btn_home_page_sign_in;
	}

	public static WebElement getTxt_email() {
		return txt_email;
	}

	public static WebElement getTxt_password() {
		return txt_password;
	}

	public static WebElement getBtn_sign_in() {
		return btn_sign_in;
	}

	public static WebElement getBtn_add_to_cart() {
		return btn_add_to_cart;
	}

	public static WebElement getBtn_checkout() {
		return btn_checkout;
	}

	public static WebElement getBtn_payment() {
		return btn_payment;
	}

	public static WebElement getTxt_first_name() {
		return txt_first_name;
	}

	public static WebElement getTxt_last_name() {
		return txt_last_name;
	}

	public static WebElement getTxt_address() {
		return txt_address;
	}

	public static WebElement getTxt_city() {
		return txt_city;
	}

	public static WebElement getTxt_state() {
		return txt_state;
	}

	public static WebElement getTxt_zip_code() {
		return txt_zip_code;
	}

}
