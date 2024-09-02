package locatorprogram;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Program4G {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() = 'Popups']")).click();
		Thread.sleep(3000);
	     driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();

		String parentId = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sindhu1945@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sindhuja");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("sindhuja");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text() = 'Sign Up']")).submit();
		
		
		
		
		
	}

}
