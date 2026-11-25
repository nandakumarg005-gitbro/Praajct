package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new EdgeDriver();
		
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://demo.guru99.com/test/upload/");	
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\gopug\\Downloads\\NANDAKUMAR G_RESUME.pdf");
//		driver.findElement(By.xpath()).sendKeys();
	}
	
}
