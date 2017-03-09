import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


@Test
public class Example {

	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		
		capabilities.setCapability("marionette", true);
		
	System.setProperty("webdriver.gecko.driver","C://Users//AJAY NAKKA//Desktop//chromedriver_win32//chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		driver.get("https://osc.npu.edu/Account/LogOn");
	driver.findElement(By.id("Username")).sendKeys("18320np");
	driver.findElement(By.id("Password")).sendKeys("");

	}

}

