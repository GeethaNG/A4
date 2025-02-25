package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2_9 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() ='Mouse Actions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text() ='Click & Hold']")).click();
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath("//div[@id='circle']"));
		act.clickAndHold(element).perform();
		Thread.sleep(3000);
	act.release(element).perform();
		driver.close();
		
}

}
