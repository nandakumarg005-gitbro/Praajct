package TestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"Sanity"})
	public void main1()
	{
		System.out.println("This is main 1");
	}
	@Test(groups= {"Sanity","Smoke"})
	public void main2()
	{
		System.out.println("This is main 2");
	}
	@Test(groups= {"Regression"})
	public void main3()
	{
		System.out.println("This is main 3");
	}
	@Test(groups= {"Sanity","Regression"})
	
		public void main4()
		{
			System.out.println("This is main 4");
		}
	@Test(groups= {"Regression"})
	public void main5()
	{
		System.out.println("This is main 5");
	}

}
