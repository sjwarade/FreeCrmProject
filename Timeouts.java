package com.crm.qa.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Timeouts{
	public static long PageLoadTimeout= 20;
	public static long implicitlywaitTimeout=20;
	public static void sendkeys(WebElement we,String str)
	{
		we.sendKeys(str);
	}
	
		public WebElement getWhenVisible(WebDriver driver,By locator, int timeout) {
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return element;

		}

}
