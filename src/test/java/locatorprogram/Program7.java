package locatorprogram;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Program7 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() = 'Frames']")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() = 'iframes']")).click();
	Thread.sleep(3000);
		driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sukanya");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123a");
	driver.findElement(By.xpath("//button[text() ='Login']")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	
    driver.findElement(By.xpath("//a[text() ='Nested iframe']")).click();
    Thread.sleep(3000);
    driver.switchTo().frame(0);
    
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kousi12@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kousi@123");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("kousi@123");
    driver.findElement(By.xpath("//button[text()='Sign Up']")).submit();
    Thread.sleep(3000);
    
	  

	}

}
