package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.Timeouts;

public class LoginPage extends TestBase{
	
	//Page Factory or Object repository
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement loginbutton;
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signupbutton;
	@FindBy(xpath="//img[contains(@class,\"img-responsive\")]")
	WebElement crmlogo;
	//Initializing Page Objects
	public LoginPage()
	{
		//use this or Loginpage.class
		PageFactory.initElements(driver, this);
	}
	//Defining page methods
	public String verifyPageTitle()
	{
		return(driver.getTitle());
	}
	public boolean validateCrmImage()
	{
		return crmlogo.isDisplayed();
	}
	public Homepage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new Homepage();
		
	}
	

}
 