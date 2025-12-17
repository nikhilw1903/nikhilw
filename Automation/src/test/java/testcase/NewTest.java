


package testcase;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import dynamiccode.base;
import io.reactivex.rxjava3.functions.Action;
import takescreenshot.take;

public class NewTest extends base{
  @Test(priority =1)
  public void q() throws IOException {
  
  launchbrowser("chrome");
  hiturl("https://www.amazon.in");
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("window.scrollBy(0,100)");
 
  }

  @Test(priority =2)
  public void d() throws InterruptedException {
  
  Actions ac = new Actions(driver);
  
WebElement sell = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
 
ac.moveToElement(sell).click().sendKeys("phone")
.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().build().perform();

WebElement drag = driver.findElement(By.xpath("//input[@id=\"p_36/range-slider_slider-item_upper-bound-slider\"]"));
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));






	
	

  
  
  
  
  }

  
  
  
  
}
