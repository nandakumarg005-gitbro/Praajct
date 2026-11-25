package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class Junitdemo {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("Bathlahem kudumba unit");
		driver.findElement(By.name("btnK")).click();
	}
	@After
	public void browerclose()
	{
	}
	

}
