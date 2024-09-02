package locatorprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class programexmp1 {
	public static void main(String[] args) throws Exception {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.cssSelector("input[class='Pke_EE']"));
	element.sendKeys("oneplus");
	element.submit();
	
	
	
	}
}
