package com.w2a.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.utilities.ExcelReader;

public class TestBase {

	/*
	 * WebDriver 
	 * Properties
	 * Logs - .log, log4j.properties, LoggerClass
	 * Excel 
	 * Mail 
	 * ExtentReports 
	 * DB
	 * http://www.way2automation.com/angularjs-protractor/banking/#/login
	 */

	public static WebDriver driver;
	public static Properties or=new Properties();
	public static Properties config=new Properties();
	public static FileInputStream fis;
	public static Logger log =Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\testData.xlsx");
	

	@BeforeSuite
	public void setUp() {
		if (driver == null) {
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				or.load(fis);
				log.debug("File loaded Successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("File loaded Successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("Launched Chrome Borwser!!");
			} else if (config.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.firefox.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\firefoxdriver.exe");
				driver = new FirefoxDriver();
				log.debug("Launched FireFox Borwser!!");
			}

			driver.get(config.getProperty("testsiteurl"));
			log.debug("Navigated to: "+config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.Wait")),
					TimeUnit.SECONDS);

		}

	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.close();
		}
		log.debug("Test Completed Successfully!!!");
	}
	
	
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
			
		}catch(NoSuchElementException e) {
			return false;
		}
	}

}
