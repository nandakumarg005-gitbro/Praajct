package Seleniumpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
    }

    @BeforeMethod
    public void site() {
        driver.get("https://www.ebay.com/?msockid=0c1b4cb76efd66f63f8359676f8267d4");
    }
    @Test
    public void test()
    {
    	WebElement we = driver.findElement(By.xpath("//span[normalize-space()='Electronics']"));
    	Actions act=new Actions(driver);
    		act.moveToElement(we);
    		act.perform();
    		driver.findElement(By.xpath("/html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
    }
	
}

