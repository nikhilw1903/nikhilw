package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dynamiccode.base;


public class all extends base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		launchbrowse("chrome");
		hiturl("https://jqueryui.com/slider/");
		Actions ac = new Actions(driver);
		
		  WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
		  
		  driver.switchTo().frame(iframe); WebElement drag =
		  driver.findElement(By.cssSelector("div#draggable")); WebElement drop =
		  driver.findElement(By.cssSelector("div#droppable"));
		  
		  ac.dragAndDrop(drag, drop).build().perform();
		  ac.clickAndHold(drag).moveToElement(drop).release().build().perform();
		  
		  
		  
		  WebElement iframe2 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		  
		  driver.switchTo().frame(iframe2);
		  
		  WebElement slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
		  
		  ac.dragAndDropBy(slider, 300, 0).perform(); Thread.sleep(2000);
		  
		  ac.dragAndDropBy(slider, -300, 0).perform();
		 

		Acdrag("//a[text()='Droppable']","//iframe[@class='demo-frame']", "//div[@id=\"draggable\"]",
				"//div[@id=\"droppable\"]", "draganddrop");

	}

}
