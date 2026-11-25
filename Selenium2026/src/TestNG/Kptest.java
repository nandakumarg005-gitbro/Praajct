package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestKp.Excelutils;

public class Kptest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new EdgeDriver();

        driver.get("https://keralaproperty.in/member/login/");
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {

        String path = "C:\\Users\\gopug\\Downloads\\Book1.xlsx";

        return Excelutils.getTestData(path, "Sheet1");
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String Username, String Password) {

        driver.findElement(By.name("ulogin")).sendKeys(Username);

        driver.findElement(By.id("upass")).sendKeys(Password);

        driver.findElement(By.id("sub_logbtn")).click();

        System.out.println("Executed for: " + Username);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains("myhome"));

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Redirected to: " + currentUrl);

        Assert.assertEquals(
                currentUrl,
                "https://keralaproperty.in/member/myhome/",
                "Login may failed for: " + Username
        );
    }

    @AfterMethod
    public void end() {

        driver.quit();
    }
}