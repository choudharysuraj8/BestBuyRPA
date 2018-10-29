package com.kat.GenericKeywords;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.kat.base.InitializeBrowser;


public class SeleniumRepoDropdown extends InitializeBrowser{

	public static boolean selectDropDownByValue(WebElement element, String value) {
		try {
			if (element != null) {
				Select selectBox = new Select(element);
				selectBox.selectByValue(value);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
	
	public static boolean selectDropDrownByIndex(WebElement element,int Index) {
		try {
			if (element != null) {
				Select SelectIndex = new Select(element);
				SelectIndex.selectByIndex(Index);
			}
			return false;
		} catch (Exception e) {
			System.out
					.println(" Error occured while selecting the option in the select box" + e.getMessage());
			return false;
		}
	}
	
	public static void selectDropDownByText(WebElement element, String value) {
		
       Select drp = new Select(element);
       drp.selectByVisibleText(value);
	}
}
