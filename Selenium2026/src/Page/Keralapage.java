package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keralapage {
	WebDriver driver;
	By kpmail=By.xpath("//*[@id=\"ulogin\"]");
	By kppass=By.xpath("//*[@id=\"upass\"]");
	By kplogin=By.xpath("//*[@id=\"sub_logbtn\"]");
	public Keralapage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(kpmail).sendKeys(email);
		driver.findElement(kppass).sendKeys(password);
		
	}
	public void login()
	{
driver.findElement(kplogin)	.click();	
	}
}
