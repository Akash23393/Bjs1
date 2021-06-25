package com.bjs.testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametarisationDemo {
	
	@Test
	@Parameters({"url","username","password"})
	public void testCase(String url,String username,String password) {
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	driver.close();
	
	
	
	
	}
	

}
