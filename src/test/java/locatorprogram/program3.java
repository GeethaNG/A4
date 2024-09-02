package locatorprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5  dark:placeholder-gray-400 focus:bg-[rgb(240,240,240)] disabled:opacity-50 disabled:cursor-not-allowed']"))
		.click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("sandhya");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sandhya09@gmail.com");
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.cssSelector("input[type='password']"));
		element.sendKeys("Sandhyaaaaaaaaaaaa");
		Thread.sleep(3000);
		element.submit();
		
				
		
	}

}
