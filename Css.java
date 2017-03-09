import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[id='main']")).sendKeys("pradeep@gmail.com");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("[id='Login']")).click();
	}

}
