package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver; 
	By Email_Mob_Box = By.xpath("//input[@id=\"lemail\"]");
	By ContinueButton = By.xpath("//span[@class=\"J14SB_42 cl_fff\"]");
	By OTPBox = By.id("notp0");
	By SubmitButton = By.xpath("//*[text()='SUBMIT']");
	
//	By myAccountText = By.xpath("//span[contains(text(),'My Account')]");
			 

	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void enterUserName()
	{
		driver.findElement(Email_Mob_Box).sendKeys("7905252418");
	}

	public void clickContinueButton()
	{
		driver.findElement(ContinueButton).click();
	}

	public void clickSubmitButton()
	{
		driver.findElement(SubmitButton).click();
	}
	
	
}



