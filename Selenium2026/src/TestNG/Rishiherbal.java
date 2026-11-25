package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherbal {

    EdgeDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/");
    }

    @Test
    public void test() {

        driver.findElement(By.xpath("")).click();

        driver.findElement(By.xpath("//a[@data-content-piece='register']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@name='email']")));

        driver.findElement(By.xpath("//input[@name='email']"))
              .sendKeys("jamescam@gmail.com");
    }
}