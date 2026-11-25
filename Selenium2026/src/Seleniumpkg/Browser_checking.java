package Seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_checking {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://keralabookstore.com/");
		driver.get("https://malayalidino.webappbazaar.com/vasu");
	}
}
