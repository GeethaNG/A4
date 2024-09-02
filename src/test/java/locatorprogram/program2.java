package locatorprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class program2 {
	public static void main(String[] args) throws Exception {
		String expectedData = "search";
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.className("Pke_EE"));
		element.sendKeys("airpods");
		element.submit();
		
		String actualurl = driver.getCurrentUrl();
		if(actualurl.contains(actualurl)) {
			System.out.println("sucessfulll!!!!");
			
		}
		else {
			System.out.println("not successfull!!");
		}
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
