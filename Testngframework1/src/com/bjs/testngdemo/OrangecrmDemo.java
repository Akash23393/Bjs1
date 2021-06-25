package com.bjs.testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangecrmDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void test1() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");;
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	@Test
	public void test2() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");;
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
