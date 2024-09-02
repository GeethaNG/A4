package locatorprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement nameTextField = driver.findElement(By.name("username"));
		nameTextField.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement emailIdTextfield = driver.findElement(By.name("password"));
		emailIdTextfield.sendKeys("Admin@123");
		Thread.sleep(3000);
		emailIdTextfield.submit();
		
		
		
		

	}

}
