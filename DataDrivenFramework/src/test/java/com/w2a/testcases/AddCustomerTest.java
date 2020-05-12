package com.w2a.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class AddCustomerTest extends TestBase {
	@Test(dataProvider = "getData")
	public void addCustomer(String firstName, String lastName, String postCode, String alertText) {

		driver.findElement(By.xpath(or.getProperty("addCustomerBtn"))).click();
		driver.findElement(By.xpath(or.getProperty("firstName"))).sendKeys(firstName);
		driver.findElement(By.xpath(or.getProperty("lastName"))).sendKeys(lastName);
		driver.findElement(By.xpath(or.getProperty("postCode"))).sendKeys(postCode);
		driver.findElement(By.xpath(or.getProperty("addCustomerSubmitbtn"))).click();
		wait = new WebDriverWait(driver, 5);

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alerTtext = alert.getText();
		Assert.assertTrue(alertText.contains(alertText));
		alert.accept();

	}

	@DataProvider
	public Object[][] getData(String fileName) {
		
		int rows = excel.getRowCount("AddCustomerTest");
		int columns = excel.getColumnCount("AddCustomerTest");
		Object [][] data = new Object[rows-1][columns];

		return data;
	}
}
