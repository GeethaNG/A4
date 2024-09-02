package locatorprogram;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		String expectedfname = "geetha";
		String expectedlname = "N G";
		for(int i=1  ;i<=2;i++)
		{
			Random r = new Random();
			int num = r.nextInt();
			String expectedemail = "gee"+ num +"@gmail.com";
			String expectedpass = "sample"+num;
		
				
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(expectedfname);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(expectedlname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(expectedemail);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(expectedpass);
		WebElement element = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		element.sendKeys(expectedpass);
		element.submit();
		String actualmail = driver.findElement(By.xpath("//a[contains(text(),'gmail.com')]")).getText();
		if(actualmail.equalsIgnoreCase(expectedemail)) {
			System.out.println("it is pass!! "+ num);
		}
		else
		{
			System.out.println("it is fail!!"+num);
		}
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(actualmail);
		driver.findElement(By.xpath("//input[@id='Password']")).click();
		driver.quit();
	}

}
}