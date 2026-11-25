package Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffverifying {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new EdgeDriver();	
	}
@BeforeMethod
public void site()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
@Test
public void test()
{
	boolean boo=driver.findElement(By.xpath("//img[@title='Rediffmail']")).isDisplayed();
	if(boo)
	{
		System.out.println("Displayed");
	}
	else
	{
		System.out.println("Not displayed");
	}
}
}
