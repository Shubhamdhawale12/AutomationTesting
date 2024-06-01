import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 class theInternetAddElement {
	 public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//DELL//eclipse-workspace//AccenturePreparation//bin//ChromeDriver//chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\DELL\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
		
		
	
	}

}
