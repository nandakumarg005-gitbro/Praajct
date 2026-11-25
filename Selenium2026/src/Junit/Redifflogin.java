package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Redifflogin {

    EdgeDriver driver;

    @Before
    public void setup() {
        driver = new EdgeDriver();

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }

    @Test
    public void test() {

        driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("Nandakumar");
        driver.findElement(By.xpath("//input[@id='logina50792b4']")).sendKeys("james342");
        
    }
}