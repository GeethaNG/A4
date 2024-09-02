package section1;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOperations {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(4000);
		Navigation nav = driver.navigate();
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();  
		Thread.sleep(3000);
		nav.refresh();
		
		
		
		
		
	}

}
