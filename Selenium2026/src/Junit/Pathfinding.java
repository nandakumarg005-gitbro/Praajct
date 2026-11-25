package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Pathfinding {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver =new EdgeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		
	}
	@Test
	public void test()
	//Relative path
	{
		driver.findElement(By.xpath("//input[@name=\"ulogin\"]")).sendKeys("kkkkpp@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"upass\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]")).click();


	}

}
