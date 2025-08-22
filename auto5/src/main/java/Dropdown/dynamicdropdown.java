package Dropdown;


import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamiccode.base;

public class dynamicdropdown  extends base{

public static void main(String[] args) throws InterruptedException {

	
	
	launchbrowser("chrome");
	hiturl("https://www.jotform.com/form/232851259741056");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	// Open dropdown
	WebElement dropdown = driver.findElement(By.xpath("//span[@id=\"select2-2jnz-container\"][@class=\"select2-selection__rendered\"]"));
dropdown.click();
WebElement dropdown2 = driver.findElement(By.xpath("//span[@id=\"select2-2jnz-container\"][@class=\"select2-selection__rendered\"]"));
dropdown2.click();    
}}
	






