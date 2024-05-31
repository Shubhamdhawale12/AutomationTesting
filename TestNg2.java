package TestNGG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {
  @Test
  public void testMethod() {
	  System.out.println("test menthod 2 ran");
  }
  
  @BeforeTest
  public void beforeMenthodTest() 
  {
	  System.out.println("this will run before method");
  }
}
