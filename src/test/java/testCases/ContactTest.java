package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.*;

import testBase.BaseClass;


public class ContactTest extends BaseClass{

	
	@Test()
	public void formTest() 
	{
		try {
			HomePage hp=new HomePage(driver);
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
