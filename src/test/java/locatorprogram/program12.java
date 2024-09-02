package locatorprogram;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class program12 {
	public static void main(String[] args) {
		int count =0;
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("iphone 14");
	element.submit();
	String expectedpname = driver.findElement(By.xpath("//div[text() ='Apple iPhone 14 (Blue, 128 GB)']")).getText();
	
	List<WebElement> allprods =driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	Iterator<WebElement> itr = allprods.iterator();
	
	while(itr.hasNext())
	
	{
		
		String actualpnames = itr.next().getText();
		if (actualpnames.equalsIgnoreCase(expectedpname))
		{
			count++;
			
		}
	}
	if (count>=1)
	{
		System.out.println("product is present"+count+"times");
	}
	else
	{
	System.out.println("product is not present");
	}

		
	}	
	}
	
	


