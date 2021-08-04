package generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * 
 * @author anand.kumar
 *
 */
public class BaaseClass extends Browser {
	@BeforeClass
	public void configBC() throws Throwable{
		launchBrowser();
		Reporter.log("Launching The Browser", true);
	}
	@AfterClass
	public void configAC() throws Throwable{
		closeBrowser();
		Reporter.log("Closed The Browser", true);
		Reporter.log("---------------------------------------", true);
		Reporter.log("----------------------------------------", true);
	}
	@BeforeMethod
	public void configBM() throws Throwable{
		BuisnessClass bc = new BuisnessClass();
		String url=bc.getPropertiesData("url");
		driver.get(url);
		driver.manage().window().maximize();
		Reporter.log(url+"Launched", true);
		
	}
}
