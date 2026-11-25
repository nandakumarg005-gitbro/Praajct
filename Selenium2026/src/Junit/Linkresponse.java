package Junit;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkresponse {
	EdgeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		<WebElement> li=driver.findElement(By.tagName("a"));
		URL ob=new Url(baseurl);
		HttpURLConnection res=(httpURLconnection)ob.openConnection();
		res.connect();
		get response
		
		
		
		

	}
}
