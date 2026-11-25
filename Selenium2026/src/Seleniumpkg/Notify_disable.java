package Seleniumpkg;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Notify_disable {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new EdgeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://www.justdial.com/");
	}
	@Test
	public void test()
	{
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--disable-notifications");
		driver=new EdgeDriver(options);
		
	}

}
