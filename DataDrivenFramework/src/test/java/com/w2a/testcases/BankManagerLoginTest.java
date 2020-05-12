package com.w2a.testcases;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void bankManagerLogin() {
		log.debug("Inside Login Test");
		driver.findElement(By.xpath(or.getProperty("bankManagerLoginbtn"))).click();

		Assert.assertTrue(isElementPresent(By.xpath("//button[text()[normalize-space()='Add Customer']]")));

		log.debug("Login Test Completed!!");

	}
}
