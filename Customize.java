import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("pradysmile4ever@gmail.com");
		driver.findElement(By.xpath(".//input[@name='pass']")).sendKeys("123456");
		driver.findElement(By.xpath(".//input[@id='u_0_q']")).click();}
	

}
