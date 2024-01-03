package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{

	public ContactPage(WebDriver driver) {
		super(driver);
	}
	// Elements
	@FindBy(css = "#wpforms-8-field_0")
	WebElement txtName;

	@FindBy(css = "#wpforms-8-field_8")
	WebElement txtStatus;

	@FindBy(id = "wpforms-8-field_1")
	WebElement txtEmail;
	
	@FindBy(xpath ="//*[@name='wpforms[submit]' and @type='submit']")
	WebElement btnSendMsg; 
	
	@FindBy(xpath = "//textarea[@id='wpforms-8-field_2']")
	WebElement txtMessage;
	

	@FindBy(xpath = "//p[contains(text(),'Thanks for contacting us! We will be in touch with')]")
	WebElement msgConfirmation;
		

	public void setName(String name) {
		txtName.sendKeys(name);

	}

	public void setStatus(String status) {
		txtStatus.sendKeys(status);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}
	
	public void setMessage(String message) {
		txtMessage.sendKeys(message);

	}

	public void clickSendMessage() {
		btnSendMsg.click();
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}//assertThat(homePage.getMessageText(), is("Hello userName"));

}
