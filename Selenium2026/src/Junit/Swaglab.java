package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Swaglab {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}
	@Test
	public void title()
	{
		   String actualtitle = driver.getTitle();
	        System.out.println(actualtitle);

	        String expectedtitle = "Swag Labs";

	        if (actualtitle.equals(expectedtitle)) {
	            System.out.println("Pass");
	        }
	        else {
	            System.out.println("Fail");
	        }
	}
	
	}
