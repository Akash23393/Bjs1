package com.bjs.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttributesDemo {

	@Test
	public void login() {
		Assert.fail();
		System.out.println("login");
	}
	@Test
	public void compose() {
		System.out.println("compose");
	}
	@Test(enabled = false)
	public void inbox() {
		System.out.println("inbox");
	}
	@Test(dependsOnMethods = "login",alwaysRun = true)
	public void logout() {
		System.out.println("logout");
	}
	

	

}
