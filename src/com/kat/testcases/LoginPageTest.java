package com.kat.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.kat.page.LoginPage;

public class LoginPageTest extends LoginPage{

	
	static Logger log = Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void loginUser(){
		PageFactory.initElements(driver, LoginPage.class);
		getTxt_username().sendKeys("komajagt807R");
		log.info("UserName Entered Successfully");
		getTxt_password().sendKeys("12345678");
		log.info("Password Entered Successfully");
		getBtn_login().click();
	}
	
}
