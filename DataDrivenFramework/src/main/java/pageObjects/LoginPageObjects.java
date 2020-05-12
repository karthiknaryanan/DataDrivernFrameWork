package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how=How.NAME,using="username")
	static public WebElement userName;
	
	@FindBy(name="password")
	static public WebElement password;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-primary')])[1]")
	static public WebElement loginButton;
	

	
}
