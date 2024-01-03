import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import PageObjects.*;
public class HomePage {
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]")
	WebElement contact;
	@Test
	public void  dd() throws Throwable {
	WebDriver driver=new ChromeDriver();
	//2) open url on the browser
	driver.get("https://everythingdataanalytics.com/");
	
	driver.manage().window().maximize(); // maximize the page
	
	ContactPage c = new ContactPage(driver);
	
	c.setName("Skillarchie");
	c.setStatus("Great");
	c.setEmail("skill@gmail.com");
	c.setMessage("lol");
	c.clickSendMessage();
	/*driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]")).click();
	//contact.click();
	driver.findElement(By.cssSelector("#wpforms-8-field_0")).sendKeys("Admin");
		
		//4) Provide password  - admin123
	driver.findElement(By.cssSelector("#wpforms-8-field_8")).sendKeys("admin123");
	driver.findElement(By.id("wpforms-8-field_1")).sendKeys("Admin@gmail.com");
	Thread.sleep(5000);
	//4) Provide password  - admin123
	driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("great");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).submit();
	*/
	Thread.sleep(5000);
	driver.close();
	}
}
