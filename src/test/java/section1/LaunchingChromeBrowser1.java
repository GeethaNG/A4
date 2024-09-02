package section1;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchingChromeBrowser1 {
	public static void main(String[] args) throws Exception {
		
		String expectedData = "demoapps";
		String expectedTitle = "DemoApps";
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		String actualDataUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println("actualDataUrl");
		System.out.println("actualTitle");
		
		if(actualTitle.contains(expectedTitle)&& actualDataUrl.contains(expectedData))
		{
			System.out.println("accessed demoapps successfully!!!!!");
		}
		else {
			System.out.println("not accessed");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
