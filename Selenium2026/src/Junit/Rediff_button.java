package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rediff_button {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		
	WebElement we=driver.findElement(By.xpath("//input[@id='Register']"));
	
	String name=we.getAttribute("value");
	System.out.println(name);
		String expectedtext = "Create my account";
		if (name.equals(expectedtext)) {
		    System.out.println("Button text verified");
		}
		else 
		{
		    System.out.println("Button text not verified");
		}
		
		
	}

}
