package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath = "//div[@class ='ast-custom-button']")
	WebElement btnContact;
	
	@FindBy(xpath="//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[4]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]") //For Search Product Test
	WebElement img_logo;
	
	@FindBy(xpath ="//div[@class ='attachment-full size-full']/preceding::*")
	//attachment-full size-full preceding::*
	WebElement img_logo1;
	
	@FindBy(xpath = "//a[contains(text(),'About')]")
	WebElement aboutpage;
	
	
	@FindBy(xpath = "//span[contains(text(),'Learn More')]")
	WebElement learnprocess;
	
	@FindBy(xpath = "//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/span[1]/span[1]")
	WebElement learndatalife;
	
	@FindBy(xpath = "//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/a[1]/span[1]/span[1]")
	WebElement learnanlyticalskill;
	
	@FindBy(xpath = "//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[2]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/a[1]/span[1]/span[1]")
	WebElement learnanlyticalthink;
	
	//
	@FindBy(xpath = "//a[contains(text(),'Data Analytics process')]")
	WebElement DataProcess;
	
	@FindBy(xpath = "//a[text() = 'Data Life Cycle']")
	WebElement Datalife;
	
	@FindBy(xpath = "//a[text() = 'Analytical skills']")
	WebElement AnalyticalSkills;
	
	@FindBy(xpath = "//a[text()= 'Analytical thinking']")
	WebElement AnalyticalThinking;
	
	@FindBy(xpath ="//a[text() = 'Skillarchie Davis']")
	WebElement Estatelogo;
	
	// Action Methods
	
	public void navi() {
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Data Analytics process')]"));
		Actions action = new Actions(driver);
		action.moveToElement(e).perform();
	}
	public void clickProcess() {
		DataProcess.click();
	}
	
	public void clickcylce() {
		Datalife.click();
	}
	
	public void clickAnalyticalSkills() {
		AnalyticalSkills.click();
	}
	
	public void clickAnalyticalThinking() {
		AnalyticalThinking.click();
	}
	public void clickContact() {
		btnContact.click();
	}

	public void clickAbout() {
		aboutpage.click();
	}
	
	public boolean checkLogoPresence()
	{
		boolean status=((WebElement) img_logo).isDisplayed();
		return status;
	}
	
	public String checkLogoPresence2()
	{
		String status= Estatelogo.getText();
		return status;
	}
}
