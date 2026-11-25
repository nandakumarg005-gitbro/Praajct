package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	@BeforeTest
	public void before()
	{
		System.out.println("Browser launch");
	}
	@BeforeMethod
	public void url()
	{
		System.out.println("URL open");
	}
	@Test(priority=1,invocationCount=2)
	public void test()
	{
		System.out.println("Test");
	}
	@Test(priority=3,dependsOnMethods= {"test"})
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}
	@AfterMethod
	public void aftermeth()
	{
		System.out.println("report");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("Close");
	}

}
