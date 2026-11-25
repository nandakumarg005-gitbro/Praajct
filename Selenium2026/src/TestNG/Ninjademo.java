package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ninjademo {
    EdgeDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
    }
    @BeforeTest
    public void site()
    {
    	driver.get("https://tutorialsninja.com/demo/");
    }
    @Test
    public void test()
    {
    	driver.findElement(By.xpath("https://tutorialsninja.com/demo/"));
    }
