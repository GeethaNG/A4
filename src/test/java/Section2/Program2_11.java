package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2_11 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	WebElement element =	driver.findElement(By.xpath("//span[text()='Login']"));
		act.moveToElement(element).contextClick().build().perform();
		Thread.sleep(3000);
	WebElement element2 = 	driver.findElement(By.xpath("//div[@class='css-175oi2r r-13awgt0 r-1iqfa7g r-60vfwk']"));
	//act.click(element2).perform();
	WebElement element3 =driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	element.sendKeys("iphone 14");
	element.submit();
	Thread.sleep(3000);
	WebElement element4 = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[24]"));
	act.scrollToElement(element4);
	
	
		
		
		
		
	}

}
