package TheInternetTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AddElement {
	WebDriver driver;

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//DELL//eclipse-workspace//AccenturePreparation//bin//ChromeDriver//chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\DELL\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		driver = new ChromeDriver(options);

	}

	@Test
	public void addElement() {

		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();		
		boolean isDeleteButtonDisplayed = driver.findElement(By.cssSelector("button[onclick='deleteElement()']")).isDisplayed();
		
		Assert.assertTrue(isDeleteButtonDisplayed, "The delete button should be displayed.");
		//Assert.assertFalse(isDeleteButtonDisplayed, "The delete button should be displayed."); this will fail 
		//as the delete button is diplayed
		

	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
