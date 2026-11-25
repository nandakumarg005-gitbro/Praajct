package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginkeralaprop {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("ulogin")).sendKeys("sureshsuruu@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("kunukunu");

		driver.findElement(By.id("sub_logbtn")).click();
	}
	

}
