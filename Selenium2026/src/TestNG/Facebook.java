package TestNG;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {

    EdgeDriver driver;

    @BeforeTest
    public void beforetest() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
    }

    @Test
    public void scrnsht() throws IOException {
        File scrsh = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrsh, new File("D:\\FB.png"));
    }

    @Test
    public void titleverify() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void linkcount() {

        List<WebElement> li = driver.findElements(By.tagName("a"));

        System.out.println("Total links: " + li.size());

        for (WebElement s : li) {

            String link = s.getAttribute("href");
            String text = s.getText();

            System.out.println(link + "-----------------" + text);
        }
    }
}