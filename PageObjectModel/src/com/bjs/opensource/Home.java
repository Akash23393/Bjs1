package com.bjs.opensource;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	By signout= By.linkText("Sign out");
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logout()
	{
		driver.findElement(signout).click();
	}
	
}
