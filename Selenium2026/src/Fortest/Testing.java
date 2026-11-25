package Fortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Keralapage;

public class Testing {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void testlogin()
	{
		Keralapage ob=new Keralapage(driver);
		ob.setvalues("sureshsuru@gmail.com","suru@123");
		ob.login();
	}
}
