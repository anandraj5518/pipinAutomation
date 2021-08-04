package objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Homepage {
@FindBy(id="Email_Address")
private WebElement unInput;

@FindBy(id="User_Password")
private WebElement passInput;

@FindBy(id="loginBtnLogin")
private WebElement goButton;

public WebElement getUnInput() {
	return unInput;
}

public WebElement getPassInput() {
	return passInput;
}

public WebElement getGoButton() {
	return goButton;
}

/*HOME Page Locators*/
@FindBy(xpath = "//strong[text()='Place Order']/..")
private WebElement placeOrderButton;

public WebElement getPlaceOrderButton() {
	return placeOrderButton;
}
	
	@FindBy(xpath = "//span[text()='Full Search']/../preceding-sibling::div/div[@class='mat-radio-ripple mat-ripple']")
	private WebElement fullSearch;

	public WebElement getFullSearch() {
		return fullSearch;
	}
	@FindBy(id="Property_First_Name")
	private WebElement buyerSellerInput;

	public WebElement getBuyerSellerInput() {
		return buyerSellerInput;
	}
	@FindBy(id="search-box")
	private WebElement propertyInput;

	public WebElement getpPropertyInput() {
		return propertyInput;
	}
	@FindBy(id="Property_Order_Number")
	private WebElement clientReferenceInput;

	public WebElement getpClientReferenceInput() {
		return clientReferenceInput;
	}
	@FindBy(id="file-upload")
	private WebElement fileUploadInput;

	public WebElement getFileUploadInput() {
		return fileUploadInput;
	}
	@FindBy(xpath ="//span[@class='mat-button-wrapper']/i")
	private List<WebElement> uploaded_file_delete_button_list;

	public List<WebElement> getUploaded_file_delete_button_list() {
		return uploaded_file_delete_button_list;
	}
	@FindBy(xpath = "//input[@id='file-upload']/following-sibling::button")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}
	@FindBy(id="conOk")
	private WebElement confirmButton;

	public WebElement getconfirmButton() {
		return confirmButton;
	}
	@FindBy(id="mat-checkbox-1-input")
	private WebElement acceptCheckBox;

	public WebElement getAcceptCheckBox() {
		return acceptCheckBox;
	}
	@FindBy(xpath ="//button[@class='btn btn-primary']")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}
	@FindBy(id="ordDetBtnSendMsg")
	private WebElement messageButton;

	public WebElement getMessageButton() {
		return messageButton;
	}
	@FindBy(id="Order_ID")
	private WebElement orderID;

	public WebElement getOrderId() {
		return orderID;
	}
	@FindBy(id="msg-area")
	private WebElement msgArea;

	public WebElement getMsgArea() {
		return msgArea;
	}
	@FindBy(id="msgSend")
	private WebElement msgSendButton;

	public WebElement getMsgSendButton() {
		return msgSendButton;
	}
	
	@FindBy(xpath ="//span[@ng-reflect-variant='title']")
	private WebElement dropDown;

	public WebElement getDropDown() {
		return dropDown;
	}
	
	@FindBy(xpath ="//button[text()='Logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}



