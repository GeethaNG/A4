package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String expectedTitle = "Flipkart";
		String expectedurl = "flipkart";
		String actualurl = driver.getCurrentUrl();
	String actualtitle=	driver.getTitle();
	System.out.println(actualurl);
	System.out.println(actualtitle);
		if(actualtitle.contains(expectedTitle)&& actualurl.contains(expectedurl))
		{
			System.out.println("home page is accessed");
		}
		else {
			System.out.println("homepage is not accessed");
		}
	}

}
