package com.kat.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitializeBrowser {

	public static WebDriver driver;
	static Logger logger = Logger.getLogger(InitializeBrowser.class);
	public static void main(String[] args) {
		//InvokeBrowser("test");
	/*	BestBuyCheckoutTest bbc = new BestBuyCheckoutTest();
		bbc.checkOut();
		
		 * LoginPageTest lpt = new LoginPageTest(driver); lpt.loginUser();
		 */
	}

	public static void InvokeBrowser() {
		//String query = null;
		// DOMConfigurator.configure("log4j.xml");
		/*
		 * DBConnectionBB obj = new DBConnectionBB();
		 * obj.ConnectionSQLite(query);
		 */
		String currentDir = System.getProperty("user.dir");
		System.out.println("Current Directory   "+currentDir);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver",
				currentDir+"/lib/chromedriver/36/chromedriver.exe");
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		//driver.navigate().to(URL);
		//logger.info("URL to proceed with transaction  -->     "+URL);
		/*BestBuyAddCart.addToCart();
		driver.close();
		driver.quit();*/
	}

}
