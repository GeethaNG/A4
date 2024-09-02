package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2_10 {
	public static void main(String[] args) throws Exception {
		Random r=new Random();
		int num =r.nextInt();
		String value =Integer.toString(num);
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("geetha",Keys.TAB,"G",Keys.TAB,"G");
		WebElement element = driver.findElement(By.xpath("//label[text() = 'Employee Id']/../following-sibling::div/input"));
		element.sendKeys("123");
		Thread.sleep(3000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_A);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_A);
		r1.keyPress(KeyEvent.VK_BACK_SPACE);
		r1.keyRelease(KeyEvent.VK_BACK_SPACE);
		element.clear();
		Thread.sleep(3000);
		element.sendKeys(value);
		


	}

}
