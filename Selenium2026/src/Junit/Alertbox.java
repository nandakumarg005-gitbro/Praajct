package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertbox {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("file:///C:/Users/gopug/OneDrive/Desktop/alertt.html");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		String ogtext="Hello !,I am suresh!!";
		if(text.equals(ogtext))
		{
			System.out.println("Text is verified and it is correct");
		}
		else
		{
			System.out.println("Text is verrified and it is not correct");
		}
		a.getText();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name=\"first name\"]")).sendKeys("Rameshan");
		driver.findElement(By.xpath("//input[@name=\"last name\"]")).sendKeys("Nair");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
	

}
