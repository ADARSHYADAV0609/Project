package com.Utility;

public class BaseDriver extends DriverInit {
	
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.firstcry.com/");
	  
	  
}
