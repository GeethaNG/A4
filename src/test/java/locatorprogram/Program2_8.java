package locatorprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2_8 {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	Actions act = new Actions(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text() = 'Mouse Actions']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text() = 'Drag & Drop']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text() = 'Drag Position']")).click();
	Thread.sleep(3000);
	WebElement mobile = driver.findElement(By.xpath("//div[text() = 'Mobile Charger']"));
	Thread.sleep(3000);
	WebElement mobileAccesseries = driver.findElement(By.xpath("//div[text() = 'Mobile Accessories']"));
	Thread.sleep(3000);
	act.dragAndDrop(mobile, mobileAccesseries).perform();
	Thread.sleep(3000);
	WebElement Mobilecover = driver.findElement(By.xpath("//div[text() = 'Mobile Cover']"));
	Thread.sleep(3000);
	act.dragAndDrop(Mobilecover, mobileAccesseries).perform();
	Thread.sleep(3000);
	WebElement LaptopCharger = driver.findElement(By.xpath("//div[text() ='Laptop Charger']"));
	Thread.sleep(3000);
	WebElement LaptopAccesserios = driver.findElement(By.xpath("//div[text() ='Laptop Accessories']"));
	act.dragAndDrop(LaptopCharger, LaptopAccesserios).perform();
	Thread.sleep(3000);
	WebElement Laptop = driver.findElement(By.xpath("//div[text() ='Laptop Cover']"));
	Thread.sleep(3000);
	act.dragAndDrop(Laptop, LaptopAccesserios).perform();
	Thread.sleep(3000);
	
	
}
}
