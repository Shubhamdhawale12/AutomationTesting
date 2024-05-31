package TestNGG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNg1 {

	@Test
	public void Demo() {
		System.out.println("Hello");
	}

	@Test
	public void SecondTest() 
	{
		System.out.println("Second test ran");
	}
	@AfterTest
	public void afterMethodTest() 
	{
		System.out.println("this will run last after method");
	}
	}
