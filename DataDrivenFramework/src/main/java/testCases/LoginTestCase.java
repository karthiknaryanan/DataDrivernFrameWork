package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



import pageObjects.LoginPageObjects;

public class LoginTestCase {


	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PageFactory.initElements(driver, LoginPageObjects.class);

		LoginPageObjects.userName.sendKeys("k@gmail.com");
		LoginPageObjects.password.sendKeys("123456789");
		LoginPageObjects.loginButton.click();

	}
}
