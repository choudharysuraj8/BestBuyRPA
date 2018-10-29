package com.kat.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.kat.base.InitializeBrowser;

public class LoginPage extends InitializeBrowser {

	@FindBy(how = How.ID, using = "UserName")
	private WebElement txt_username;

	@FindBy(how = How.ID, using = "Password")
	private WebElement txt_password;

	@FindBy(how = How.ID, using = "Login")
	private WebElement btn_login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxt_username() {
		return txt_username;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}

	public WebElement getBtn_login() {
		return btn_login;
	}

}
