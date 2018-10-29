package com.kat.GenericKeywords;

import org.openqa.selenium.WebElement;

public class ElementPresent {

	public static Boolean isExist(WebElement element) throws Throwable {
		boolean value = false;

		if (element.isDisplayed()) {
			Thread.sleep(2000);
			value = true;
		} else if (element.isEnabled()) {
			value = true;
		} else if (element.isSelected()) {
			value = true;
		}
		return value;
	}

}
