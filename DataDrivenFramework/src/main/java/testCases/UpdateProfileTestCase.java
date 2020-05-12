package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfileTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.userName.sendKeys("k@gmail.com");
		LoginPageObjects.password.sendKeys("123456789");
		LoginPageObjects.loginButton.click();
		Thread.sleep(3000);
		UpdateProfileObjects.myProfile.click();
		UpdateProfileObjects.phoneNumber.sendKeys("1234567890");
		UpdateProfileObjects.city.sendKeys("Dubai");
		UpdateProfileObjects.submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.findElementByName("username").sendKeys(
		 * "karthiknarayanan1990@gmail.com");
		 * driver.findElementByXPath("//span[text()='Password']").sendKeys("123456789");
		 * driver.findElementByXPath("(//button[contains(@class,'btn btn-primary')])[1]"
		 * ).click(); driver.findElementByLinkText("My Profile").click();
		 * driver.findElementByName("phone").sendKeys("123456789");
		 * driver.findElementByName("city").sendKeys("dubai");
		 * driver.findElementByXPath("//button[contains(@class,'btn btn-block')]").click
		 * (); driver.quit();
		 */

	}

}
