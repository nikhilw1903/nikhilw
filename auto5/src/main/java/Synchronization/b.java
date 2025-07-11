package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class b {
public static void main(String[] args) {

	
	
WebDriver driver = new ChromeDriver();
driver.get("https://flipkart.com");
	
	// Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// Explicit Wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
	element.click();

}
}
