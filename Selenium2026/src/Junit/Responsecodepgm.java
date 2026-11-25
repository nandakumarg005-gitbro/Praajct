package Junit;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class Responsecodepgm {
	EdgeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set()
	{
		driver=new EdgeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void linkcouunt() throws Exception
	{
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Valid URL");
		}
		else
		{
			System.out.println("Invalid URL");
		}
	}

}
