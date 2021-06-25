package com.bjs.testngdemo;

import org.testng.annotations.Test;

public class TestngxmlDemo {

	
	@Test(groups = "inbox")
	public void positivecredential1()
	{
		System.out.println("positivecredential1");
	}
	@Test(groups = "compose")
	public void positivecredential2()
	{
		System.out.println("positivecredential2");
	}
	@Test(groups = "logout")
	public void positivecredential3()
	{
		System.out.println("positivecredential3");
	}
	@Test(groups = "compose")
	public void positivecredential4()
	{
		System.out.println("positivecredential3");
	}
	@Test(groups = "inbox")
	public void positivecredential5()
	{
		System.out.println("positivecredential3");
	}
}
