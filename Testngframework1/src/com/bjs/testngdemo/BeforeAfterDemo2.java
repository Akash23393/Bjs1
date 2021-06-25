package com.bjs.testngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterDemo2 {

		
	@Test(priority=4)
	public void a() {
		System.out.println("a");
	}
	@Test(priority=3)
	public void b() {
		System.out.println("a");
	}
	@Test(priority=2)
	public void c() {
		System.out.println("a");
	}
	@Test
	public void d() {
		System.out.println("a");
	}
	
}
