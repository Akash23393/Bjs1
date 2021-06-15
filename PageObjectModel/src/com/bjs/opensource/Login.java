package com.bjs.opensource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

		
	By username=By.id("email");
	By password=By.id("passwd");
	By signin=By.id("SubmitLogin");
	
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername()
	{
		driver.findElement(username).sendKeys("ihassan395@gmail.com");
	}


	public void password()
	{
		driver.findElement(password).sendKeys("Admin@123");
	}

	public void signIn()
	{
		driver.findElement(signin).click();
	}


}
