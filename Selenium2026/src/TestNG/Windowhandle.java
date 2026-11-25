package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window title"+driver.getTitle());
		driver.findElement(By.xpath(""));
	}

}
