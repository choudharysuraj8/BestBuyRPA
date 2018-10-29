package com.kat.GenericKeywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kat.base.InitializeBrowser;
import com.kat.page.BestBuyCheckout;

public class SeleniumRepoClick extends InitializeBrowser{

	
	
	public static void click(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(element));
			if (ElementPresent.isExist(element)) {
				// Thread.sleep(9000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
						waitElement);
				waitElement.click();
			} else {
				
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch blocks
			e.getMessage();
		}
	}

	public static void moduSubmit(String locator) throws Throwable {
		WebElement ele = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", ele);
		ele.submit();
	}

	public static void moduClick(String locator) throws Throwable {

		WebElement ele = driver.findElement(By.xpath(locator));
		// ele.submit();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 1px solid red;');", ele);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		ele.click();
	}

	public static void listmoduClick(String locator) {

		List<WebElement> ele = driver.findElements(By.xpath(locator));

		for (int i = 0; i < ele.size(); i++) {
			ele = driver.findElements(By.xpath(locator));
			ele.get(6).click();
		}
	}
}
