package com.bjs.testngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterDemo {
	
	@Test
	public void test1() {
		System.out.println("test case 1");
	}
	
	@Test
	public void test2() {
		System.out.println("test case 2");
	}
	
	@AfterMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@BeforeMethod
	public void afterMethod() {
		System.out.println("after method");
	}

}
