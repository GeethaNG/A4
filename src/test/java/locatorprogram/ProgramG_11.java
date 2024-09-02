package locatorprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramG_11 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text() = 'From']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("blr");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text() ='Bengaluru']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("dxb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dubai']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(3000);
	     driver.findElement(By.xpath("//div[@aria-label='Fri Oct 11 2024']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
	     driver.findElement(By.xpath("//button[text() = 'APPLY']")).click();
	   Thread.sleep(3000);
	     driver.findElement(By.xpath("//a[text() = 'Search']")).click();
	     
	     
	     
		
		
		
	}

}
