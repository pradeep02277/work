import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		
		driver.findElement(By.id("Email")).sendKeys("pradeep02727@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
        driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("15861");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		
		
		
		/*driver.get("http://qaclickacademy.com");
		driver.findElement(By.xpath(".//*[@id='prefooter']/div/div/div[4]/p[3]/a")).click();*/
		
	
	}

}
