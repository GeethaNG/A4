package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2_6 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	WebElement electronics = driver.findElement(By.xpath("//span[text() ='Electronics']"));
	act.click(electronics).perform();
	WebElement men = driver.findElement(By.xpath("//span[text() ='Men']"));
	act.click(men).perform();
	driver.navigate().back();
	driver.close();
	
	
		
		
		
		
		
		
	}

}
