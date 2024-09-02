package locatorprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program15 {
	public static void main(String[] args) throws Exception {
		WebElement element = null;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() = 'Link']")).click();
		Thread.sleep(3000);
		//List<WebElement> allLinks= driver.findElements

}}
