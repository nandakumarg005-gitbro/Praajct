package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/s?k=join+amazon+prime&adgrpid=1327112148528381&hvadid=82944842492529&hvbmt=bb&hvdev=c&hvlocphy=149676&hvnetw=o&hvqmt=b&hvtargid=kwd-82945393014646%3Aloc-90&hydadcr=5626_2502674&mcid=3861a9d242543041b997efa1f39279d3&msclkid=c12ddc55a7ff10895f94b6ca5f95d76e&tag=msndeskstdin-21&ref=pd_sl_9ntprzamt3_b");		
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//form[@id=\"nav-search-bar-form\"]/div[3]/div/span/input")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		driver.navigate().back();
		driver.get("https://www.amazon.in/s?k=join+amazon+prime&adgrpid=1327112148528381&hvadid=82944842492529&hvbmt=bb&hvdev=c&hvlocphy=149676&hvnetw=o&hvqmt=b&hvtargid=kwd-82945393014646%3Aloc-90&hydadcr=5626_2502674&mcid=3861a9d242543041b997efa1f39279d3&msclkid=c12ddc55a7ff10895f94b6ca5f95d76e&tag=msndeskstdin-21&ref=pd_sl_9ntprzamt3_b");
	}
}
