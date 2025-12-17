package Dropdown;


import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import calender.calender;
import dynamiccode.base;
import dynamiccode.base;

public class prac_dynamicdropdown  extends base{

public static void main(String[] args) throws InterruptedException {

	
	
	  // Launch browser
    launchbrowse("chrome");
    hiturl("https://www.railyatri.in/");
	 Actions ac = new Actions(driver);
    // Scroll down using JavaScript
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,200)");

    //from
   WebElement from = driver.findElement(By.xpath("//input[@id=\"TrainFromSourceField\"]"));
    from.click();
    from.sendKeys("NGP");
   driver.findElement(By.xpath("//span[text()=\"NGP\"]//self::span")).click();
//    to
   WebElement to = driver.findElement(By.xpath("//input[@id=\"toSourceField\"]"));
   to.click();
   to.sendKeys("PUNE");
  driver.findElement(By.xpath("//span[text()=\"PUNE\"]//self::span")).click();


  driver.findElement(By.xpath("//button[text()=\"Search train\"]")).click();

}

}



	






