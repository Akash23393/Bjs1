package com.bjs.opensource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpensourceLoginDemo {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\akash\\eclipse-workspace\\KeywordDrivenFramework\\src\\com\\bjs\\utilities\\keyworddriven.properties");
		
		Properties p=new Properties();
		p.load(fis);
		
		String loginKey=p.getProperty("login");
		String usernameKey=p.getProperty("username");
		String passwordKey=p.getProperty("password");
		String submitKey=p.getProperty("submit");
		String commentsKey=p.getProperty("comments");
		
		
		System.out.println(loginKey);
		System.out.println(usernameKey);
		System.out.println(passwordKey);
		System.out.println(submitKey);
		System.out.println(commentsKey);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		
		driver.findElement(By.linkText(loginKey)).click();
		driver.findElement(By.id(usernameKey)).sendKeys("opensourcecms");
		driver.findElement(By.id(passwordKey)).sendKeys("opensourcecms");
		driver.findElement(By.id(submitKey)).click();
		driver.findElement(By.xpath(commentsKey)).click();
		driver.close();
		
		
		
		
		
		
	}

}
