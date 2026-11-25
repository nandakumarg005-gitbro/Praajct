package Junit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Elementscrnshot {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() throws IOException
	{
		WebElement day=driver.findElement(By.xpath("//select[@class=\"day\"]"));
		File img=day.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(img, new File("D://Day scrnsht.png"));
    	FileHandler.copy(img, new File("./Rediff_screenshots//day.png"));
	}
}
