
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	WebDriver driver;
	
	@Test
	public void testGmail() throws IOException{
	
		System.setProperty("webdriver.chrome.driver", "C://Users//AJAY NAKKA//Desktop//chromedriver_win32//chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		
	driver.findElement(By.id("FirstName")).sendKeys("pradeep");
	driver.findElement(By.id("LastName")).sendKeys("kumar");
	driver.findElement(By.id("GmailAddress")).sendKeys("pradeepkumar");
	driver.findElement(By.id("Passwd")).sendKeys("pradeep123456");
	driver.findElement(By.id("PasswdAgain")).sendKeys("pradeep123456");
	
	
	driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
	
	

	driver.findElement(By.id("BirthDay")).sendKeys("24");
	driver.findElement(By.id("BirthYear")).sendKeys("1991");
	
	
		driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
	
		

	
	driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("pradeep02727@gmail.com");
	
	}
	
	

	}



