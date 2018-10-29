package com.kat.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.kat.GenericKeywords.SeleniumRepoClick;
import com.kat.GenericKeywords.SeleniumRepoDropdown;
import com.kat.GenericKeywords.SeleniumRepoSendKey;
import com.kat.base.InitializeBrowser;
import com.kat.bean.ClientDetail;
import com.kat.page.BestBuyCheckout;

public class BestBuyCheckoutTest extends InitializeBrowser{

	static Logger logger = Logger.getLogger(BestBuyCheckoutTest.class);
	
	public static void initCheckoutProcess(ClientDetail clientDetail) throws InterruptedException{
		PageFactory.initElements(driver, BestBuyCheckout.class);
		SeleniumRepoClick.click(BestBuyCheckout.getLnk_go_to_cart());
		logger.info("Go to cart to start checkout process");
		Thread.sleep(10000);
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_checkout());
		logger.info("Checkout option selected, Proceed with Checkout");
		Thread.sleep(10000);
		
		if(clientDetail.getGuestCheckout().equalsIgnoreCase("Yes")){
			guestCheckout();
		}
	}
	
	
	public static void guestCheckout(){
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_continue_as_guest());
		logger.info("Continue as Guest Checkout option has been selected");
		
		
		//Shipping Address Information
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_first_name(),"1");
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_last_name(),"kahano");
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_address(),"123 Mian street a");
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_city(), "ilmington");
		SeleniumRepoDropdown.selectDropDownByValue(BestBuyCheckout.getDrpdwn_state(), "DE");
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_code(), "11987");
		
		BestBuyCheckout.getChkbox_save_shipping_address_as_billing().click();
		//Save shipping as billing - pending to write
		
	
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_guest_email_address(), "skahanov@gmail.com");
		logger.info("Entered email address for guest login");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_guest_phone_number(), "7778769876");
		logger.info("ENtered phone number for guest login");
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_guest_continue_payment_info());
		logger.info("Continue to payyment information has been selected");
		
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_keep_address_entered());
			
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_guest_continue_payment_info());
		logger.info("Continue to payyment information has been selected");
		
		
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_guest_card(), "8521241257455423");
		logger.info("Credit/Debit card details enerted");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_billing_firstName(), "1");
		logger.info("Entered billing first name");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_billing_lastName(), "Kahano");
		logger.info("Entered billing last name");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_billing_address_1(), "422 Empire BLVD");
		logger.info("Entered Address 1");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_billing_address_2(), "BLVD");
		logger.info("Entered Address 2");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_billing_city(), "Brooklyn");
		logger.info("Billing City");
		
		SeleniumRepoDropdown.selectDropDownByValue(BestBuyCheckout.getDrpdwn_billing_state(), "NY");
		logger.info("State Selected");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_billing_zipcode(), "11227");
		logger.info("Zip code added");
		
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_guest_place_order());
		logger.info("Order has been successfully placed");

		logger.info("Billing State")
;		
		
		
	}
	
	public static void checkOut(ClientDetail clientDetail) throws InterruptedException {

		PageFactory.initElements(driver, BestBuyCheckout.class);
		
		logger.info("Checkout Process has been started");
		/*WebElement ele1 = BestBuyCheckout.getIcn_country_us();
		ele1.click();
		*/
		//System.out.println("Best buy Checkout   "+driver);

		//System.out.println("   "+BestBuyCheckout.getIcn_country_us());
		
		
		SeleniumRepoClick.click(BestBuyCheckout.getLnk_go_to_cart());
		logger.info("Go to cart to start checkout process");
		Thread.sleep(10000);
		
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_checkout());
		logger.info("Checkout option selected, Proceed with Checkout");
		Thread.sleep(10000);
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_email(),clientDetail.getEmail());
		logger.info("Entered email_id/username for login");
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_password(), clientDetail.getPassword());
		logger.info("Entered password for login");
		
		SeleniumRepoClick.click(BestBuyCheckout.getBtn_sign_in());
		logger.info("Sigin button selected, getting login on application");
		Thread.sleep(20000);
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_first_name(), clientDetail.getFirstName());
		logger.info("FirstName of Buyer filled");
		Thread.sleep(5000);
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_last_name(), clientDetail.getLastName());
		logger.info("LastName of Buyer filled");
		Thread.sleep(5000);
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_address(), clientDetail.getBillingAddress_1());
		logger.info("Address of buyer filled");
		Thread.sleep(5000);
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_city(), clientDetail.getBillingCity());
		logger.info("City of Buyer filled");
		Thread.sleep(5000);
		
		SeleniumRepoDropdown.selectDropDownByValue(BestBuyCheckout.getDrpdwn_state(), clientDetail.getBillingState());
		logger.info("State of Buyer is selected");
		Thread.sleep(5000);
		
		SeleniumRepoSendKey.sendKeys(BestBuyCheckout.getTxt_code(), clientDetail.getBillingZip());
		logger.info("zip code of Buyer filled");
		//SeleniumRepoClick.click(BestBuyCheckout.getBtn_payment());
	}
	
	public static void dummyCheckout(){
		logger.info("Checkout started for current order transaction");
		System.out.println("Inside Checkout Method");
	}
}
