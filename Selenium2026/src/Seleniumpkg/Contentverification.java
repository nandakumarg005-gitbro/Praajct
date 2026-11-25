package Seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contentverification {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/?zx=1788585993800");

        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);

        String expectedtitle = "Google";

        if (actualtitle.equals(expectedtitle)) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
      String pagesrc=driver.getPageSource();
      if(pagesrc.contains("Gmail"))
      {
    System.out.println("gmail found");
      }
      else
      {
    	  System.out.println("not found");
      }
    }
}