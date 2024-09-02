package locatorprogram;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Program16 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	element.sendKeys("iphone 14");
	element.submit();
	Thread.sleep(3000);
	
	
	//List<WebElement> elements =  driver.findElement(By.xpath("( ));
	Thread.sleep(3000);
	
			
			
			
		
		
		
		
	}

}
