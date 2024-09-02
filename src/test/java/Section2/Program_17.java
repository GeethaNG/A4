package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_17 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Thread.sleep(3000);
	WebElement men =	driver.findElement(By.xpath("//span[text()='Men']"));
    act.moveToElement(men).perform();
 
List<WebElement> ele = driver.findElements(By.xpath("//a[@class='jBYtJt cNDIdi CP4tVY']"));
for(WebElement element: ele)
{
	String value =element.getText();
	System.out.println(value);
	}
 
 
 
		
	}

}
