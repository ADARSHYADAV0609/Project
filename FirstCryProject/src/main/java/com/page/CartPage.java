package com.page;
 
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class CartPage {
 
	WebDriver driver;
 

	By LoginButton = By.xpath("//span[@class=\"anch poplogin_main poplogin R12_61\"]");
//	By Email_Mob_Box = By.xpath("//input[@id=\"lemail\"]");
//	By ContinueButton = By.xpath("//span[@class=\"J14SB_42 cl_fff\"]");
//	By OTPBox = By.id("notp0");
//	By SubmitButton = By.xpath("//*[text()='SUBMIT']");
//	
//	By SearchItem = By.xpath("//input[@id=\"search_box\"]");
//	By searchIcon = By.xpath("//span[@class=\"search-button\"]");
//	By Select_product = By.xpath("//img[@title=\"Babyhug Disney  Single Jersey Knit Full Sleeves Shirt With Winnie & Friends Print & Pocket Detailing - White\"]");
//	
//	By addtoCartButton = By.xpath("//span[contains(text(),'ADD TO CART')]");
//	By cartIcon = By.xpath("//span[@id=\"cart_TotalCount\"]");
	
	By change = By.xpath("//div[contains(@class,'address_change btn_sb6')]");
	By editButton = By.xpath("//span[contains(@class,'edsp lft')]");
	
	By changeBuilding = By.xpath("//input[contains(@id,'AddressLine1')]");
	By changeStreet = By.xpath("//input[contains(@id,'AddressLine2')]");
	By changePin = By.xpath("//input[contains(@id,'ShipPinCode')]");

	By saveAddressButton = By.xpath("//div[contains(@class, 'J14SB_42 cl_fff btn svbtn btn_fill') and contains(text(), 'SAVE ADDRESS')]");
	By enterCheckPin = By.xpath("//input[@id=\"cty_pin_New\"");
	By checkPin = By.xpath("//span[@id=\"apply_pin_New\"]");
	
	By quantityButton = By.xpath("(//span[contains(@class,'J13M_42 cl_21 selectarrow cart-icon')])[1]");
	By select_no_quantity = By.xpath("(//span[@class=\"cnt-no selected J14R_42 cl_21\"])[2]");
	By removeButton = By.xpath("(//div[@class=\"new-shortone shortcomm\"])[1]");
	By moveToShortlistButton = By.xpath("(//div[@class=\"new-shorttwo shrtp shortcomm\"])[1]");
	By couponViewall = By.xpath("(//span[@class=\"link_blue all_coup\"])[2]");
	By applyCoupon = By.xpath("//div[@class='apply_cpn  bg_29 br_fff' and @onclick='applycouponcode(\"topview\",this,\"NEW40CT\");']");
	
	By placeOrderButton = By.xpath("//div[@class=\"showpayment_popup\"]");
	//    By credit_debit = driver.findElement(By.xpath("//div[@class=\"main-credebi creditdebit_sec btn\"]"));  
 
	
//	public void initp2(WebDriver driver)
//	{
//		this.driver = driver;
//	}
//	
   
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public void changeDeliveryDetails() {
		driver.findElement(change).click();


	}
	
	public void clickEditButton() {
		driver.findElement(editButton).click();


	}
	
	public void enterChangeBuilding() throws InterruptedException {
		
		driver.findElement(changeBuilding).clear();
		Thread.sleep(1000);
		driver.findElement(changeBuilding).sendKeys("715 Malviya nagar");


		
	}
	
	public void enterChangeStreet() throws InterruptedException {
		driver.findElement(changeStreet).clear();
		Thread.sleep(1000);
		driver.findElement(changeStreet).sendKeys("Chowk Prayagraj");


	}
	
	public void changePin() throws InterruptedException {
		driver.findElement(changePin).clear();
		Thread.sleep(1000);
		driver.findElement(changePin).sendKeys("211003");
		
		System.out.println("Successfully run changepin  ");


	}
	
	public void saveButton() {
		driver.findElement(saveAddressButton).click();
		System.out.println("Successfully run SaveButton  ");


	}
	
	public void ClickQtyButton()
	{
		driver.findElement(quantityButton).click();


	}
 
	public void ClickSelectQty()
	{
		driver.findElement(select_no_quantity).click();
	}
 
	public void ClickRemove()
	{
		driver.findElement(removeButton).click();
		
		System.out.println("Successfully run remove   ");


	}
 
	public void ClickShortList()
	{
		driver.findElement(moveToShortlistButton).click();
		
		System.out.println("Successfully run ShortList  ");
	}
 
	public void viewAllCoupons()
	{
		driver.findElement(couponViewall).click();
		
		System.out.println("Successfully run ViewAll  ");
	}
 

	
	
	
	
	
//	public void checkPin() {
//		driver.findElement(LoginButton).click();
//	}
// 
//	public void enterPin()
//	{
//		driver.findElement(Email_Mob_Box).sendKeys("7905252418");
//	}
	
	
	
 
	
 
	//    public void applyCoupon() {
	//    	driver.findElement(applyCoupon).click();
	//    }
	//    
	//    public void clickPlaceOrder() {
	//    	driver.findElement(placeOrderButton).click();
	//    }
 
}
 