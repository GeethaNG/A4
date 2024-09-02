package section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChromeBrowserp2 {
	public static void main(String [] args) throws Exception {
		String expectedData = "Demoapps";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
			String expectedTitle = "DemoApps";
			String actualData = driver.getCurrentUrl();
			String actualTitle = driver.getTitle();
			System.out.println(actualData);
			System.out.println(actualTitle);
			if (actualTitle.contains(expectedTitle)&& actualData.contains(expectedData))
			{
				System.out.println("accessed successfully");
			}
			
			else {
				System.out.println("not accessed");
				
			} 
			Thread.sleep(4000);
			driver.close();
			
			
	}
}
