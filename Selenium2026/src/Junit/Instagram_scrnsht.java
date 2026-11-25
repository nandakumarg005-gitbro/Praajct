package Junit;

import org.junit.Before;
import org.openqa.selenium.edge.EdgeDriver;

public class Instagram_scrnsht {
EdgeDriver driver;
@Before
public void setup()
{
	driver.get("https://www.instagram.com/?flo=true ");
	
}
}
