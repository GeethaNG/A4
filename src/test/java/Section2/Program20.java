package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program20 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement element=	driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("i phone14");
//		element.submit();
		driver.navigate().refresh();
//		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']"));
		element.sendKeys("samsung");

	}

}
