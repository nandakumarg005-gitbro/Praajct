package Seleniumpkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Cakehut_title_content_verification {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.cakehut.in/x-mas-new-year-cakes");
        String actual_title = driver.getTitle();
        System.out.println(actual_title);
       String expected_title = "X-Mas/New Year Cakes";
        if (actual_title.equals(expected_title)) {
            System.out.println("Title verified");
        } 
        else {
            System.out.println("Title not verified");
        }
        String page_src = driver.getPageSource();
        if (page_src.contains("Price")) {
            System.out.println("Content verified");
        } 
        else {
            System.out.println("Content not verified");
        }

    }
}