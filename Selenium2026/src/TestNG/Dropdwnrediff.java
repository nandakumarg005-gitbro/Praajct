package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdwnrediff {

    EdgeDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
    }

    @BeforeMethod
    public void open() {
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }

    @Test
    public void test() {

        WebElement drop = driver.findElement(By.xpath("//select[@class='day']"));
        Select d = new Select(drop);

        d.selectByVisibleText("08");
        
        WebElement mon = driver.findElement(By.xpath("//select[@class='middle month']"));
        Select m = new Select(mon);

        m.selectByVisibleText("AUG");
        

        WebElement year = driver.findElement(By.xpath("//select[@class='year']"));
        Select y = new Select(year);

        y.selectByVisibleText("2005");
    }


   
   
}