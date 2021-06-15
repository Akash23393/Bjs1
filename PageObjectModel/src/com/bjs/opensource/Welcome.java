package com.bjs.opensource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	
	
	By signin=By.linkText("Sign in");
	WebDriver driver;
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnSignIn()
	{
		driver.findElement(signin).click();
	}
	
	
}
