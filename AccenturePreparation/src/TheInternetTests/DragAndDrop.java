package TheInternetTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.chrome.driver",
					"C://Users//DELL//eclipse-workspace//AccenturePreparation//bin//ChromeDriver//chromedriver-win64//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Users\\DELL\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			
			//Using ACtion class for Drag and drop
			
			Actions A = new Actions(driver);
			
			A.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).build().perform();
			
			
			

		}

	}

