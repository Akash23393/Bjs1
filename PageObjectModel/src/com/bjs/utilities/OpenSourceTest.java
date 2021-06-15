package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.opensource.Home;
import com.bjs.opensource.Login;
import com.bjs.opensource.Welcome;

public class OpenSourceTest {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		Welcome w=new Welcome(driver);
		w.clickOnSignIn();
		
		Login l=new Login(driver);
		l.enterUsername();
		l.password();
		l.signIn();
		
		Home h=new Home(driver);
		h.logout();
		
		driver.close();
		
	}

}
