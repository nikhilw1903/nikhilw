package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
			
//		✅ Basic XPath:
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//		✅ Contains():
			
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//			✅ Starts-with():
			
			driver.findElement(By.xpath("//input[starts-with(@name, 'user')]")).sendKeys("admin");
//			✅ Text():
			
			driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//			✅ And/Or conditions:
		
			driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("admin");
//			🔹 9. Custom Attribute Locator (using CSS or XPath)
			
			driver.findElement(By.cssSelector("input[data-testid='user']"));
		
			driver.findElement(By.xpath("//input[@data-testid='user']"));
//			🔹 10. Chained Locators (Within a Section)
//			Used when you want to find an element within another element.

	
			WebElement form = driver.findElement(By.id("loginForm"));
			form.findElement(By.name("username")).sendKeys("admin");

		
		
		
		
	}

}
