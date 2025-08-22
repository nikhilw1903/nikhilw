 package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
;

public class b {
public static void main(String[] args) {

	
	
WebDriver driver = new ChromeDriver();
driver.get("https://flipkart.com");
	
//inplicit wait

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


//Explicitwait

//a)webdriver wait()
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someId")));

WebDriverWait wait2=  new WebDriverWait(driver, Duration.ofSeconds(10));
wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));




//b)fluentwait
Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);

}
}