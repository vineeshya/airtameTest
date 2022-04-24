package pk21april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testebay21aprilclass {
	

	private static String testUrl;
	private static int waitTime = 5000;
	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// setup chromedriver
				System.setProperty("webdriver.chrome.driver", "webDriver/chromedriver.exe");
				driver = new ChromeDriver();
				testUrl = "https://www.ebay.com/";
				driver.get(testUrl);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
	Thread.sleep(waitTime);
	
	//driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).click();
	driver.findElement(By.id("gdpr-banner-accept")).click();			
driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")).click();

driver.quit();
	}

}