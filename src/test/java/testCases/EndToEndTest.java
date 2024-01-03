package testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.*;
import testBase.BaseClass;
public class EndToEndTest extends BaseClass{
	WebElement e = null;
	HomePage hp = null;
	
	@Test(priority=1)
	public void LogoPrenseceTest() throws InterruptedException {
		hp = new HomePage(driver);
		//check for logo presence
		try {
			Assert.assertEquals(hp.checkLogoPresence(), true);
		}catch (Exception e){
			e.getMessage();
			Assert.fail();
		}
			Thread.sleep(200);
	}
	
	@Test(priority=2)
	void DropDownTest() throws InterruptedException
	{
		hp.navi();
		Thread.sleep(200);
		hp.clickProcess();
		hp.navi();
		Thread.sleep(200);
		hp.clickcylce();
		Thread.sleep(500);
		hp.navi();
		hp.clickAnalyticalSkills();
		Thread.sleep(500);
		hp.navi();
		hp.clickAnalyticalThinking();
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	void AboutPageTest() throws InterruptedException
	{
		hp.clickAbout();;
		Thread.sleep(200);
	}
	
	@Test(priority=4)
	void ContactPageTest() throws InterruptedException
	{
		try {
			
			ContactPage c = new ContactPage(driver);
			hp.clickContact();	
			c.setName(randomeString());
			c.setStatus(randomeString());
			c.setEmail(randomEmail());
			c.setMessage(randomeString());
			Thread.sleep(5000);
			c.clickSendMessage();
			String targetmessage = c.getConfirmationMsg();
			String message = "Thanks for contacting us! We will be in touch with you shortly.";
			Assert.assertEquals(targetmessage,message,"Invalid login data");
		
		}
		catch(Exception e)
		{
			e.getStackTrace();
			Assert.fail();
		}
	}
}
