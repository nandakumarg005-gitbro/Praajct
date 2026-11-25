package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Rediffmail_login {
	
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
driver.findElement(By.xpath("//form[@name=\"register_mail\"]/div/div[2]/input")).sendKeys("Nandakumar g");
driver.findElement(By.xpath("//form[@method=\"post\"]/div/div[3]/div/input")).sendKeys("Skibidi");
driver.findElement(By.xpath("//form[@method=\"post\"]/div/div[6]/div/input")).sendKeys("kanakuna");
driver.manage().window().maximize();
driver.navigate().back();


}
	
	

}
