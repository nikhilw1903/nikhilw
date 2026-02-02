package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class new1 {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,100)");
	
		WebElement drag = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[1]"));
		WebElement drop = driver.findElement(By.cssSelector("div#trash"));
		WebElement frame = driver.findElement(By.xpath("ul#gallery"));
	driver.switchTo();	
		Actions a= new Actions(driver);
	
		
		
		
	
	
	}

}
