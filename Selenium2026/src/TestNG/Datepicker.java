package TestNG;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new EdgeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	
}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div"));
		String month1 =month.getText();
		if(month1.equals("January"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		}
	}
	
	
	List<WebElement> alldate =driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
for(WebElement dateelements:alldate)
{
	String date=dateelements.getText();
	if(date.equals("29"))
			{
				dateelements.click();
				break;
			}
}
}}
