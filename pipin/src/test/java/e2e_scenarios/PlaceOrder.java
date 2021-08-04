package e2e_scenarios;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import generic.BaaseClass;
import generic.BuisnessClass;
import objectRepository.Homepage;

public class PlaceOrder extends BaaseClass {
	/*Object Creation Of "SoftAssert" Class*/
	SoftAssert asser = new SoftAssert();
	 /**
     * @throws Throwable 
	 * @throws Throwable
     * @expectedResult As a user, I should have ability to Login to pipin Loginpage and by providing valid data we can Navigate to Homepage.
     */	
	@Test
	public void placeOrderTest() throws  Throwable{
		Homepage hp= PageFactory.initElements(driver, Homepage.class);
		BuisnessClass bc= new BuisnessClass();
		bc.waitForElement(hp.getUnInput());
		hp.getUnInput().sendKeys(bc.getPropertiesData("username"));
		hp.getPassInput().sendKeys(bc.getPropertiesData("password"));
		hp.getGoButton().submit();
		Reporter.log("Sucessfully Logged in", true);
		hp.getPlaceOrderButton().click();
		Reporter.log("Clicked on Place Order", true);
		bc.waitForElementToClick(hp.getFullSearch());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", hp.getFullSearch());
		hp.getBuyerSellerInput().sendKeys(bc.getPropertiesData("buyer"));
		
		jse.executeScript("arguments[0].click()", hp.getpClientReferenceInput());
		hp.getpClientReferenceInput().sendKeys(bc.getPropertiesData("reference"));
		hp.getFileUploadInput().sendKeys("./src/main/resources/pdfs/Payslip_Apr_2021.pdf");
		hp.getFileUploadInput().sendKeys("./src/main/resources/pdfs/Payslip_Feb_2021.pdf");
		hp.getFileUploadInput().sendKeys("./src/main/resources/pdfs/Payslip_Mar_2021.pdf");
		//bc.waitForElementToClick(hp.getContinueButton());
		jse.executeScript("arguments[0].click()", hp.getFullSearch());
		hp.getpPropertyInput().sendKeys(bc.getPropertiesData("property"));
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		
	List<WebElement> del= hp.getUploaded_file_delete_button_list();
	bc.waitForElementToClick(del.get(1));
	jse.executeScript("arguments[0].click()", del.get(1));
	//hp.getconfirmButton().click();
	bc.waitForElementToClick(hp.getconfirmButton());
	jse.executeScript("arguments[0].click()", hp.getconfirmButton());
	bc.waitForElementToClick(hp.getContinueButton());
	jse.executeScript("arguments[0].click()", hp.getContinueButton());
	bc.waitForElementToClick(hp.getAcceptCheckBox());
	jse.executeScript("arguments[0].click()", hp.getAcceptCheckBox());
	bc.waitForElementToClick(hp.getSubmitButton());
	jse.executeScript("arguments[0].click()", hp.getSubmitButton());
	String oid=hp.getOrderId().getText();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   String currentTime=dtf.format(now);  
	bc.waitForElementToClick(hp.getMessageButton());
	jse.executeScript("arguments[0].click()", hp.getMessageButton());
	hp.getMsgArea().sendKeys("Anand "+oid+" "+currentTime);
	bc.waitForElementToClick(hp.getMsgSendButton());
	jse.executeScript("arguments[0].click()", hp.getMsgSendButton());
	bc.waitForElementToClick(hp.getDropDown());
	jse.executeScript("arguments[0].click()", hp.getDropDown());
	jse.executeScript("arguments[0].click()", hp.getLogout());

	}

}