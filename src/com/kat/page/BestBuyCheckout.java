package com.kat.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BestBuyCheckout {

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

	// @FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block
	// button-state-default btn-primary btn-leading-ficon']")
	@FindBy(how = How.XPATH, using = "//div[@class='add-to-cart-button']/div/button")
	private static WebElement btn_add_to_cart;

	@FindBy(how = How.XPATH, using = "//button[@class='close-modal-text']")
	private static WebElement btn_continue_shopping;
	
	@FindBy(how = How.XPATH, using = "//button[@class='c-close-icon']")
	private static WebElement btn_close_add_to_cart;
	

	@FindBy(how = How.XPATH, using = "//a[@href='/cart']")
	private static WebElement lnk_no_thanks_cart;

	@FindBy(how = How.XPATH, using = "//a[@href='https://www.bestbuy.com/cart']")
	private static WebElement lnk_go_to_cart;

	@FindBy(how = How.XPATH, using = "//div[@class='listing-header__button']/button[contains(text(),'Checkout')]")
	private static WebElement btn_checkout;

	@FindBy(how = How.XPATH, using = "//butfld-eton[@class='btn btn-lg btn-block btn-primary']")
	private static WebElement btn_payment;

	@FindBy(how = How.XPATH, using = "//input[@id='consolidatedAddresses.ui_address_2.firstName']")
	private static WebElement txt_first_name;

	@FindBy(how = How.XPATH, using = "//input[@id='consolidatedAddresses.ui_address_2.lastName']")
	private static WebElement txt_last_name;

	@FindBy(how = How.XPATH, using = "//input[@id='consolidatedAddresses.ui_address_2.street']")
	private static WebElement txt_address;

	@FindBy(how = How.XPATH, using = "//input[@id='consolidatedAddresses.ui_address_2.city']")
	private static WebElement txt_city;

	@FindBy(how = How.XPATH, using = "//select[@id='consolidatedAddresses.ui_address_2.state']")
	private static WebElement drpdwn_state;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'zipcode')]")
	private static WebElement txt_code;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@id,'save-for-billing')]")
	private static WebElement chkbox_save_shipping_address_as_billing;
	

	@FindBy(how = How.XPATH, using = "//div[@class='button--continue']/button")
	private static WebElement btn_continue_to_payment;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'save-for-billing')]")
	private static WebElement chk_save_billing_address;
	

	@FindBy(how = How.XPATH, using = "//button/span/p[contains(text(),'Keep Address as Entered')]")
	private static WebElement btn_keep_address_entered;
	

	// Guest Checkout

	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/identity/guest')]")
	private static WebElement btn_continue_as_guest;

	@FindBy(how = How.ID, using = "user.emailAddress")
	private static WebElement txt_guest_email_address;

	@FindBy(how = How.ID, using = "user.phone")
	private static WebElement txt_guest_phone_number;

	@FindBy(how = How.XPATH, using = "//button/span/p[contains(text(),'Continue to Payment Information')]")
	private static WebElement btn_guest_continue_payment_info;

	@FindBy(how = How.ID, using = "optimized-cc-card-number")
	private static WebElement txt_guest_card;

	@FindBy(how = How.ID, using = "payment.billingAddress.firstName")
	private static WebElement txt_billing_firstName;

	@FindBy(how = How.ID, using = "payment.billingAddress.lastName")
	private static WebElement txt_billing_lastName;

	@FindBy(how = How.ID, using = "payment.billingAddress.street")
	private static WebElement txt_billing_address_1;

	@FindBy(how = How.ID, using = "payment.billingAddress.street2")
	private static WebElement txt_billing_address_2;

	@FindBy(how = How.ID, using = "payment.billingAddress.city")
	private static WebElement txt_billing_city;

	@FindBy(how = How.ID, using = "payment.billingAddress.state")
	private static WebElement drpdwn_billing_state;

	@FindBy(how = How.ID, using = "payment.billingAddress.zipcode")
	private static WebElement txt_billing_zipcode;

	@FindBy(how = How.XPATH, using = "//button/span/p[contains(text(),'Place Your Order')]")
	private static WebElement btn_guest_place_order;

	
	//a[contains(@href,'orderlookup?orderId')]
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'orderlookup?orderId')]")
	private static WebElement ro_txt_order_number;
	

	
	
	public static WebElement getIcn_country_us() {
		return icn_country_us;
	}
	public static WebElement getBtn_continue_shopping() {
		return btn_continue_shopping;
	}
	
	

	public static WebElement getBtn_close_add_to_cart() {
		return btn_close_add_to_cart;
	}

	public static WebElement getLnk_go_to_cart() {
		return lnk_go_to_cart;
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

	public static WebElement getBtn_continue_to_payment() {
		return btn_continue_to_payment;
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

	public static WebElement getDrpdwn_state() {
		return drpdwn_state;
	}

	public static WebElement getTxt_code() {
		return txt_code;
	}

	public static WebElement getLnk_no_thanks_cart() {
		return lnk_no_thanks_cart;
	}

	public static WebElement getBtn_continue_as_guest() {
		return btn_continue_as_guest;
	}

	public static void setBtn_continue_as_guest(WebElement btn_continue_as_guest) {
		BestBuyCheckout.btn_continue_as_guest = btn_continue_as_guest;
	}

	public static WebElement getTxt_guest_email_address() {
		return txt_guest_email_address;
	}

	public static void setTxt_guest_email_address(WebElement txt_guest_email_address) {
		BestBuyCheckout.txt_guest_email_address = txt_guest_email_address;
	}

	public static WebElement getTxt_guest_phone_number() {
		return txt_guest_phone_number;
	}

	public static void setTxt_guest_phone_number(WebElement txt_guest_phone_number) {
		BestBuyCheckout.txt_guest_phone_number = txt_guest_phone_number;
	}

	public static WebElement getBtn_guest_continue_payment_info() {
		return btn_guest_continue_payment_info;
	}

	public static void setBtn_guest_continue_payment_info(WebElement btn_guest_continue_payment_info) {
		BestBuyCheckout.btn_guest_continue_payment_info = btn_guest_continue_payment_info;
	}

	public static WebElement getTxt_guest_card() {
		return txt_guest_card;
	}

	public static void setTxt_guest_card(WebElement txt_guest_card) {
		BestBuyCheckout.txt_guest_card = txt_guest_card;
	}

	public static WebElement getTxt_billing_firstName() {
		return txt_billing_firstName;
	}

	public static void setTxt_billing_firstName(WebElement txt_billing_firstName) {
		BestBuyCheckout.txt_billing_firstName = txt_billing_firstName;
	}

	public static WebElement getTxt_billing_lastName() {
		return txt_billing_lastName;
	}

	public static void setTxt_billing_lastName(WebElement txt_billing_lastName) {
		BestBuyCheckout.txt_billing_lastName = txt_billing_lastName;
	}

	public static WebElement getTxt_billing_address_1() {
		return txt_billing_address_1;
	}

	public static void setTxt_billing_address_1(WebElement txt_billing_address_1) {
		BestBuyCheckout.txt_billing_address_1 = txt_billing_address_1;
	}

	public static WebElement getTxt_billing_address_2() {
		return txt_billing_address_2;
	}

	public static void setTxt_billing_address_2(WebElement txt_billing_address_2) {
		BestBuyCheckout.txt_billing_address_2 = txt_billing_address_2;
	}

	public static WebElement getTxt_billing_city() {
		return txt_billing_city;
	}

	public static void setTxt_billing_city(WebElement txt_billing_city) {
		BestBuyCheckout.txt_billing_city = txt_billing_city;
	}

	
	public static WebElement getDrpdwn_billing_state() {
		return drpdwn_billing_state;
	}

	public static void setDrpdwn_billing_state(WebElement drpdwn_billing_state) {
		BestBuyCheckout.drpdwn_billing_state = drpdwn_billing_state;
	}

	
	
	public static WebElement getTxt_billing_zipcode() {
		return txt_billing_zipcode;
	}

	public static WebElement getBtn_guest_place_order() {
		return btn_guest_place_order;
	}

	public static void setBtn_guest_place_order(WebElement btn_guest_place_order) {
		BestBuyCheckout.btn_guest_place_order = btn_guest_place_order;
	}

	public static void setBtn_continue_to_payment(WebElement btn_continue_to_payment) {
		BestBuyCheckout.btn_continue_to_payment = btn_continue_to_payment;
	}

	public static WebElement getChkbox_save_shipping_address_as_billing() {
		return chkbox_save_shipping_address_as_billing;
	}

	public static WebElement getBtn_keep_address_entered() {
		return btn_keep_address_entered;
	}
	public static WebElement getRo_txt_order_number() {
		return ro_txt_order_number;
	}
	public static void setRo_txt_order_number(WebElement ro_txt_order_number) {
		BestBuyCheckout.ro_txt_order_number = ro_txt_order_number;
	}


	
	
	
	
	
}
