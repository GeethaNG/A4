package locatorprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program8 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() = 'Dropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		element.sendKeys("in");
		element.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='react-select-5-input']")).sendKeys("pra");
		
		
	}

}
