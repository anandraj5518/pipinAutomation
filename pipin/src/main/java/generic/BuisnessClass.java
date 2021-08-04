package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuisnessClass {
	/**
	 * This Method Is To Read The Data From The PROPERTIES File Based On Keys
	 * @param key
	 * @return value of the key
	 * @throws Throwable
	 */
		public String getPropertiesData(String key) throws Throwable{
			FileInputStream fis=new FileInputStream("./src/test/resources/external/testData.properties");
			Properties poj= new Properties();
			poj.load(fis);
			String value=poj.getProperty(key);
			return value;
		}
		/**
		 * This Method Is Used To Wait For Element Present In GUI
		 * @param element
		 * @throws Throwable
		 */
		public void waitForElement(WebElement element) {
			WebDriverWait wait =new WebDriverWait(Browser.driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		/**
		 * This Method Is Used To Wait For Element Present In GUI
		 * @param element
		 * @throws Throwable
		 */
		public void waitForElementToClick(WebElement element) {
			WebDriverWait wait =new WebDriverWait(Browser.driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
}
