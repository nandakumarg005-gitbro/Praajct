package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    EdgeDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
    }

    @BeforeMethod
    public void site() {
        driver.get("https://keralaproperty.in/#");
    }

    @Test
    public void test() {

        SoftAssert soft = new SoftAssert();

        String title = driver.getTitle();

        soft.assertEquals(title, "Keralaproperty", "Title not matched");

        soft.assertTrue(
            driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]")).isDisplayed(),
            "Login button displayed");
        
System.out.println("Test execution continues");
        soft.assertAll();
    }
}