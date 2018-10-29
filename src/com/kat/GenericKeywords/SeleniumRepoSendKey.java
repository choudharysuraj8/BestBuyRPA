package com.kat.GenericKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kat.base.InitializeBrowser;


public class SeleniumRepoSendKey extends InitializeBrowser{

	public static void sendKeys(WebElement element,String str){
		System.out.println(str);
		element.clear();
		element.sendKeys(str);
	}
	
	
	public static void modusendKeys(String locator, String value){
			
		WebElement ele = driver.findElement(By.xpath(locator));
		System.out.println(ele.isEnabled());
		ele.clear();
		ele.sendKeys(value);
	}
	
	public static void iframesendKeys(String locator, String value){
		
		WebElement ele = driver.findElement(By.xpath(locator));
		System.out.println(ele.isEnabled());
		ele.sendKeys(value);
	}
}
