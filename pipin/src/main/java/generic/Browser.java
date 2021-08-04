package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

/**
 * 
 * @author anand.kumar
 *
 */
public class Browser {

	/*
	 * Driver Object Is Global, Static and Public Variable
	 */
	public static WebDriver driver;
	
	/**
	 * Launch The Browser 
	 * @throws Throwable
	 */
	 public static void launchBrowser() throws Throwable{
		
		 /*Launch The Browser*/
		 	 System.setProperty("webdriver.chrome.driver", "./src/main/resources/browserDrivers/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			 Reporter.log("Launched Chrome Browser", true);
		
}
	 /*Close The Browser*/
	 public static void closeBrowser() {
		 driver.close();
	 }
}