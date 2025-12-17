package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamiccode.base;

public class pracStaticdrop extends base {

	public static void main(String[] args) throws InterruptedException {

		launchbrowse("chrome");
		hiturl("https://demo.automationtesting.in/Register.html");

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		WebElement skill = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
	
//		Static dropdown with select tagname
		
		Select sc= new Select(skill);
		
		sc.selectByValue("Analytics");
		Thread.sleep(3000);
		
//		Static dropdown without select tagname		

	 WebElement drop = driver.findElement(By.xpath("//span[@class=\"selection\"]"));

	drop.click();
	driver.findElement(By.xpath("//li[text()=\"Japan\"]//self::li")).click();

	
	}

}
