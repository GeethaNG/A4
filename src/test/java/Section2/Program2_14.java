package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2_14 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		//Actions act= new 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	//	driver.manage().window().maximize();
		//driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//section[text() ='Date & Time Picker']")).click();
	///Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() ='Time Picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Pick Time']")).click();
		Thread.sleep(3000);
//	WebElement ele = driver.findElement(By.xpath("//span[text() ='10']");
//	act.moveToElement(ele);
		
		}

}
