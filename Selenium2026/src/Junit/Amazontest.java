package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazontest {

    EdgeDriver driver;

    @Before
    public void setup() {

        driver = new EdgeDriver();

        driver.get("https://www.amazon.in/s?k=join+amazon+prime&adgrpid=1327112148528381&hvadid=82944842492529&hvbmt=bb&hvdev=c&hvlocphy=149676&hvnetw=o&hvqmt=b&hvtargid=kwd-82945393014646%3Aloc-90&hydadcr=5626_2502674&mcid=3861a9d242543041b997efa1f39279d3&msclkid=e50f21b6d46b18315a264b146b62e036&tag=msndeskstdin-21&ref=pd_sl_9ntprzamt3_b");
    }

    @Test
    public void test() {

        // Search Mobiles
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");

        // Click Search
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        // Click Cart
        driver.findElement(By.xpath("//span[@id='nav-cart-count']")) .click();

        // Click Account 
        driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")).click();

        // Enter email
        driver.findElement(By.xpath("//input[@id='ap_email_login']")) .sendKeys("rameshannair@gmail.com");
        
        //Click Submit
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        // Go back
        driver.navigate().back();
        driver.navigate().back();

        // Open Mobiles page
        driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031");

        // Click Mobiles
        driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")) .click();

        // Click Hamburger 
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
    }
}