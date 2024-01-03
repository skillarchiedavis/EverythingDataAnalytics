package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.*;
import testBase.BaseClass;


@Test
public class HomePageTest extends BaseClass{
	
	
	HomePage hp = null;
	@Test(priority=1)
	void testLogo()
	{
		hp = new HomePage(driver);
		boolean presence =	hp.checkLogoPresence();
		try {
			Assert.assertEquals(hp.checkLogoPresence(), true);
		}catch (Exception e){
			e.getMessage();
			Assert.fail();
		}
	}
	
	
	@Test(priority=2)
	void testLogin()
	{
		//HomePage hp = new HomePage(driver);
		hp.clickAbout();
				
	}
	
	@Test(priority=3)
	void testsub() throws InterruptedException
	{
		//HomePage hp = new HomePage(driver);
		Thread.sleep(50);
		hp.clickContact();
				
	}
	
	@Test(priority=4)
	void testsub2() throws InterruptedException
	{
		hp.navi();
		Thread.sleep(200);
		hp.clickcylce();
		Thread.sleep(500);
	}
		
		
	
}