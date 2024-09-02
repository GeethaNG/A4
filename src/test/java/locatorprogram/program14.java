package locatorprogram;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class program14 {
	public static void main(String[] args) throws Exception {
		WebElement element = null;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() = 'Link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() = 'Contact Us']")).click();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//div[text() ='Contact Us']"));
		System.out.println("the contact us page is displayed:"+element.isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Payments']")).click();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//div[text()='Payments']"));
		System.out.println("the payment page is displayed:"+element.isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//div[text()='Return Policy']"));
		System.out.println("the return page is displayed:"+element .isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Youtube']")).click();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//div[text() = 'Youtube']"));
		System.out.println("the youtube page is verified:"+ element.isDisplayed());
		driver.quit();

		
		
		
		
		
	}
}
