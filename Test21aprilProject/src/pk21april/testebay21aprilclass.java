package pk21april;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testebay21aprilclass {
	
	private static String testUrl;
	private int waitTime = 5000;
	private static WebDriver driver;
	
	public static void main(String[] args) {
		// setup chromedriver
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
				testUrl = "https://airtame.com/";
				driver.get(testUrl);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
	
				

	}

}
