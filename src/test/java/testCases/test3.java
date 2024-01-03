package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3 {

	//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	@Test
	public void testing() throws InterruptedException	{
	//1) Launch browser
	//ChromeDriver driver=new ChromeDriver();
	WebDriver driver=new ChromeDriver();
	
	//2) open url on the browser
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize(); // maximize the page
	
	
	Thread.sleep(5000);
	
	//3) Provide username  - Admin
	//WebElement txtUsername=driver.findElement(By.name("username"));
	//txtUsername.sendKeys("Admin");
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//4) Provide password  - admin123
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	//5) Click on Submit button 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(7000);
	
	//6) Verify the title of dashboard page   
	//Title validation
	/*String act_title=driver.getTitle();
	String exp_title="OrangeHRM";
	
	if(act_title.equals(exp_title))
	{
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("failed");
	}
	*/
	
	// Lable validation after successful login
	String act_label = "";
	try
	{
	act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	}
	catch(NoSuchElementException e)	{ 
		}
	
	String exp_label="Dashboard";
	
	if(act_label.equals(exp_label))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
	}
	
	//7) close browser
	//driver.close();
	driver.quit();
}
	
}
