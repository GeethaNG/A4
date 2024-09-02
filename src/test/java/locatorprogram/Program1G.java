package locatorprogram;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Program1G {
	public static void main(String[] args) throws Exception {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("samsung mobiles");
		element.submit();
		Thread.sleep(4000);
		WebElement product=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 FE (Graphite, 128 GB)']/../../div[@class='col col-5-12 BfVC2z']/div/div/div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(product.getText());
//		List<WebElement> allprods = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
//		for(WebElement price:allprods)
//		{			
//				System.out.println(price.getText());
//		}

	}
}