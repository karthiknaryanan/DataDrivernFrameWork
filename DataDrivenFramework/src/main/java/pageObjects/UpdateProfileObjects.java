package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects {
	
	
	@FindBy(xpath="(//a[@class='nav-link go-text-right'])[1]")
	static public WebElement myProfile;
	@FindBy(name="phone")
	static public WebElement phoneNumber;
	@FindBy(name="city")
	static public WebElement city;
	@FindBy(xpath="//button[contains(@class,'btn btn-block')]")
	static public WebElement submit;

	/*
	 * static public WebElement myProfile(WebDriver driver) { return
	 * driver.findElement(By.linkText("My Profile")); }
	 * 
	 * static public WebElement phoneNumber(WebDriver driver) { return
	 * driver.findElement(By.name("phone")); }
	 * 
	 * static public WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city")); }
	 * 
	 * static public WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath("//button[contains(@class,'btn btn-block')]")); }
	 */

}
