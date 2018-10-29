package com.kat.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.kat.GenericKeywords.SeleniumRepoClick;
import com.kat.base.InitializeBrowser;
import com.kat.bean.ClientDetail;
import com.kat.bean.TransactionDetail;
import com.kat.bean.TransactionOrder;
import com.kat.dao.TransactionOrderDAO;
import com.kat.page.BestBuyCheckout;

public class BestBuyAddCart extends InitializeBrowser {
	static Logger logger = Logger.getLogger(BestBuyAddCart.class);
	static boolean country_flag = true;

	public static void addToCart(TransactionOrder transactionOrder) {

		try {

			// InitializeBrowser.InvokeBrowser(transactionOrder.getUrl());
			PageFactory.initElements(driver, BestBuyCheckout.class);
			driver.navigate().to(transactionOrder.getUrl());
			logger.info("Get Country xPath -->  " + BestBuyCheckout.getIcn_country_us());
			/*
			 * if (isCountry_flag()) {
			 * SeleniumRepoClick.click(BestBuyCheckout.getIcn_country_us());
			 * setCountry_flag(false); }
			 */ for (int count = 1; count <= transactionOrder.getOrderCount(); count++) {
				/*
				 * driver.navigate().to(transactionOrder.getUrl()); logger.info(
				 * "Get Country xPath -->  " +
				 * BestBuyCheckout.getIcn_country_us());
				 */
				if (isCountry_flag()) {
					SeleniumRepoClick.click(BestBuyCheckout.getIcn_country_us());
					setCountry_flag(false);
				}

				logger.info("Loop count for transaction --> " + count);
				// InitializeBrowser.InvokeBrowser(transactionOrder.getUrl());

				// Click Add to Cart
				SeleniumRepoClick.click(BestBuyCheckout.getBtn_add_to_cart());
				
				SeleniumRepoClick.click(BestBuyCheckout.getBtn_close_add_to_cart());
				// SeleniumRepoClick.click(BestBuyCheckout.getLnk_no_thanks_cart());
				//SeleniumRepoClick.click(BestBuyCheckout.getBtn_continue_shopping());
				/*
				 * if(count!=transactionOrder.getOrderCount()){
				 * driver.navigate().back(); }
				 */ transactionOrder.setOrderPlaced(count);
				TransactionOrderDAO.update(transactionOrder);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isCountry_flag() {
		return country_flag;
	}

	public static void setCountry_flag(boolean country_flag) {
		BestBuyAddCart.country_flag = country_flag;
	}
}
