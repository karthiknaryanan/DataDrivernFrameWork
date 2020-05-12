package pageFactoryWithoutFindBy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement Submit;
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		Submit.click();
	}

}
