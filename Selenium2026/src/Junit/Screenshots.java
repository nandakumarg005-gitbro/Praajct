package Junit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver = new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void screenshot() throws IOException
	{
		File scrsh=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrsh,new File("D://error7.png"));
	}

}
