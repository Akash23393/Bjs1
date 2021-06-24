package com.bjs.ecom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcomLoginDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\akash\\eclipse-workspace\\DataDrivenFramework\\src\\com\\bjs\\utilities\\datadrivenframework.properties");
	
		Properties p=new Properties();
		p.load(fis);
		
		String urldata=p.getProperty("url");
		String logindata=p.getProperty("login");
		String usernamedata=p.getProperty("username");
		String passworddata=p.getProperty("password");
		String submitdata=p.getProperty("submit");

		
		System.out.println(urldata);
		System.out.println(logindata);
		System.out.println(usernamedata);
		System.out.println(passworddata);
		System.out.println(submitdata);

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(urldata);
		
		driver.findElement(By.linkText(logindata)).click();
		driver.findElement(By.id(usernamedata)).sendKeys("opensourcecms");
		driver.findElement(By.id(passworddata)).sendKeys("opensourcecms");
		driver.findElement(By.id(submitdata)).click();
		
		
		driver.quit();
		
	
	
	
	
	
	
	
	
	}

}
