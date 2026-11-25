package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassert {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
    }

    @BeforeMethod
    public void site() {
        driver.get("https://keralaproperty.in/#");
    }
    @Test
    public void test()
    {
    	String actual=driver.getTitle();
    	String expected="www.kerala real estate properties";
    
    Assert.assertEquals(actual,expected,"title verified");
    System.out.println("title");
    }
    @Test
    public void test2()
    {
    	WebElement search=driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]"));
    	boolean searchenable=search.isEnabled();
    	Assert.assertTrue(searchenable,("it is not enabled"));
    }
}