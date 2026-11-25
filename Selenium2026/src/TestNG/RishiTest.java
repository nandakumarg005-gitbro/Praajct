package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RishiTest {
	EdgeDriver driver;
	   @BeforeTest
	   public void browser()
	   {
		   driver = new EdgeDriver();
	   }
	   @BeforeMethod
	   
	   //TO GET SITE
	   
	   public void site()
	   {
		   driver.get("https://rishiherbalindia.linker.store/");
	   }
	   @Test
	   public void test() throws IOException, InterruptedException
	   {
		   driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		   
		   
		   //TITLE VERIFICATION
		   
		   
		   SoftAssert soft=new SoftAssert();
		String actual_title=driver.getTitle();
		soft.assertEquals(actual_title,"Herbal Product | Rishi Herbal india","Title mismatched");
		System.out.println(actual_title);
		Thread.sleep(3000);
		
		//SELECT INSTOCKS IN CHECKBOX
		
		driver.findElement(By.xpath("//*[@id=\"outOfStockFilter\"]")).click();
		Thread.sleep(3000);
		
		//SEARCH (SUPER HEALTH) IN SEARCH BOX
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Super health");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
		Thread.sleep(3000);
		
		//FOR TAKING (BABY) SCREENSHOT
		
		WebElement baby= driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a"));

File src = baby.getScreenshotAs(OutputType.FILE);

File dest = new File("D:\\Baby.png");

FileUtils.copyFile(src, dest);
Thread.sleep(3000);

//DROPDOWN SELECTION

WebElement drop_down = driver.findElement(
 By.xpath("//*[@id='input-sort']")
);

Select ss = new Select(drop_down);

ss.selectByValue("alphabet-asc");

Thread.sleep(3000);

//CLICK ON SKIN LINK

driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
Thread.sleep(3000);

//SCROLLDOWN TO BOTTOM ,SELECT ALOE BERRY CREAM

WebElement cream = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[14]/div/div/div[1]/div/a/img"));
((JavascriptExecutor) driver).executeScript(
 "arguments[0].scrollIntoView({block:'center'});",cream
);

Thread.sleep(2000);
cream.click();	
	   }
}
