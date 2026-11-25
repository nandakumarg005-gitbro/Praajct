package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Iframe {
	@Test
	public void ifrm()
	{
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 //Switch to first i frame
		 
		 WebElement frame1 = driver.findElement(By.name("iframeResult"));
		 driver.switchTo().frame(frame1);
		 
		 
		 //Switch to inner frame
		 
		 WebElement innerframe = driver.findElement(By.tagName("iframe"));
		 driver.switchTo().frame(innerframe);
		 
		 
		 //Access H1
		 WebElement text = driver.findElement(By.tagName("h1"));
		 
		 System.out.println(text.getText());
		 
		 //Back to main page
		 driver.switchTo().defaultContent();
		 driver.close();
	}

}
