package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	
	WebDriver driver;
	By Select_product = By.xpath("//img[@title=\"Babyhug Disney  Single Jersey Knit Full Sleeves Shirt With Winnie & Friends Print & Pocket Detailing - White\"]");
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	public void Select_product()
	{
		driver.findElement(Select_product).click();
		
		System.out.println("Successfully run SelectProduct  ");
 
	}
}
