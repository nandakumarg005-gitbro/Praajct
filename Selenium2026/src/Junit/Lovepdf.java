package Junit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lovepdf {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new EdgeDriver();	
	}
@BeforeMethod
public void site()
{
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
@Test
public void test() throws AWTException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Select PDF file']")).click();
		fileupload("\"C:\\Users\\gopug\\Downloads\\NANDAKUMAR G_RESUME.pdf\"");
	}
public void fileupload(String p) throws AWTException
{
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	Robot robot=new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}

