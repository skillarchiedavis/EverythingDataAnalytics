package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;  // logging
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import PageObjects.ContactPage;
import PageObjects.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.BaseClass;;

public class debug{

	@Test
	public void testing() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://everythingdataanalytics.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]")).click();
		driver.findElement(By.cssSelector("#wpforms-8-field_0")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#wpforms-8-field_8")).sendKeys("admin123");
		driver.findElement(By.id("wpforms-8-field_1")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("admin123");
		Thread.sleep(5000);
		//c.clickSendMessage();
		///String targetmessage = c.getConfirmationMsg();
		//String message = "Thanks for contacting us! We will be in touch with you shortly.";
		//Assert.assertEquals(targetmessage,message,"Invalid login data");
		driver.quit();
	}
	/*
	@BeforeClass
	void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://everythingdataanalytics.com/");
		Thread.sleep(5000);
		
	}
	
	/*@Test(priority=1)
	void testLogo()
	{
		//lp=new LoginPage(driver);
		lp=new LoginPage2(driver);
		
		Assert.assertEquals(lp.checkLogoPresence(), true);
	}*/
	
	
	/*@Test(priority=1)
	void testLogin() throws InterruptedException
	{
		hp.clickContact();	
		c.setName("sss");
		c.setStatus("well");
		c.setEmail("skill@gmail.com");
		c.setMessage("Great");
		Thread.sleep(5000);
		c.clickSendMessage();
		String targetmessage = c.getConfirmationMsg();
		String message = "Thanks for contacting us! We will be in touch with you shortly.";
		Assert.assertEquals(targetmessage,message,"Invalid login data");
	}
	
	@AfterClass
	public
	void tearDown()
	{
		driver.quit();
	}*/
}
