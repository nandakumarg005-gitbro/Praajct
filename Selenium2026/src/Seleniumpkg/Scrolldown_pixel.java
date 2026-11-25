package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown_pixel {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new EdgeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://keralaproperty.in/#");
	}
@Test
//SCROLL DOWN TO BOTTOM
public void test() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/footer/div/ul/li[3]/a")).click();
	// UNTIL ELEMENT IS VISIBLE
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	WebElement el=driver.findElement(By.xpath("//input[@placeholder='Name']"));
//	js.executeScript("arguments[0].scrollIntoView();",el);
//	el.sendKeys("madhavan");
	
	
	
	
	
	
	
	
}


}
